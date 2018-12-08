package com.sailing.bdip.metadata.filter;

import com.sailing.bdip.metadata.manage.entity.SbpStorageInstance;
import com.sailing.bdip.metadata.manage.mapper.SbpStorageInstanceMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.persistence.Column;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Aspect  //aop切面
@Component
@Order(-99)
@EnableAspectJAutoProxy(proxyTargetClass=true)  //spring自动切换JDK动态代理和CGLIB
@PropertySource("classpath:metadata_monitor.properties")
public class TestAspect {

    private static final Logger logger = LoggerFactory.getLogger(TestAspect.class);

    @Resource
    private SbpStorageInstanceMapper sbpStorageInstanceMapper;

    @Autowired
    private Environment env;

    @Pointcut("execution(public * com.sailing.bdip.metadata.manage.service.SbpStorageInstanceService.*(..)) || " +
            "execution(public * com.sailing.bdip.metadata.manage.service.SbpStorageObjService.*(..))")
    public void pointcut(){}

//    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint)  {
        System.out.println("doBefore");

    }

//    @After("pointcut()")
    public void doAfter(JoinPoint joinPoint){
        /**
         * Signature 包含了方法名、申明类型以及地址等信息
         * 接口全路径
         */
        System.out.println(joinPoint.getSignature().getDeclaringTypeName());
        //输入的参数列表
        SbpStorageInstance instance = (SbpStorageInstance)joinPoint.getArgs()[0];
        System.out.println(instance);
        //类全路径
        System.out.println(joinPoint.getTarget().getClass().getName());
        //调用的方法
        System.out.println(joinPoint.getSignature().getName());
    }

    /**
     * 环绕通知
     * @param joinPoint
     */
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around....................");
        Object result = null;
        boolean  change_process_flag = env.getProperty("change_process_flag",Boolean.class);
        System.out.println("change_process_flag="+change_process_flag);
        if(change_process_flag){
            result = processChange(joinPoint);
        }else{
            result = processOp(joinPoint);
        }
        return result;
    }

    /**
     * 处理元数据变化
     * @param joinPoint
     */
    private Object processChange(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = null;
        Object[] args = joinPoint.getArgs();//参数
        String fullClassName = joinPoint.getTarget().getClass().getName();
        String className = fullClassName.substring(fullClassName.lastIndexOf(".")+1);
        String methodStr = env.getProperty(className);
        String method = joinPoint.getSignature().getName();
        if(null!=methodStr && methodStr.indexOf(method)!=-1){
            if(null!=args && args.length>0){
                if("SbpStorageInstanceService".equals(className)){
                    SbpStorageInstance newInstance = (SbpStorageInstance)args[0];
                    SbpStorageInstance oldInstance = sbpStorageInstanceMapper.selectByPrimaryKey(newInstance.getSiId());
                    result =  processOp(joinPoint);
                    if(Integer.parseInt(result.toString())>0){
                        //比较字段
                        String[] compareArr = {"dsName","dsCode","dsName"};
                        Map<String,String> map = compareObj(oldInstance, newInstance, compareArr);
                        //比较结果处理
                    }
                }else if("SbpStorageObjService".equals(className)){

                }else if("SbpStorageObjAttrService".equals(className)){

                }
            }
        }else{//非过滤方法
            result = processOp(joinPoint);
        }
        return result;
    }

    /**
     * 操作处理
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    private Object processOp(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();//参数
        Object result = joinPoint.proceed(args);
        return result;
    }

    /**
     * 比较对象字段内容
     * @param oldObj
     * @param newObj
     * @param compareArr
     * @return
     */
    public Map compareObj(Object oldObj,Object newObj,String[] compareArr){
        Class cls = oldObj.getClass();
        String resultStr = null;
        List<String> compareArrList = Arrays.asList(compareArr);
        Map<String,String> map = new HashMap<String,String>();
        try {
            for(int i=0;i<compareArr.length;i++){
                Field  field =  cls.getDeclaredField(compareArr[i]);
                boolean isExistAnn = field.isAnnotationPresent(Column.class);
                //设置些属性是可以访问的
                field.setAccessible(true);
                String  value1 = (String)field.get(oldObj);
                String  value2 =(String)field.get(newObj);
                //不相等
                if(!value1.equals(value2) && isExistAnn){
                    //获取注解
                    Column columnName = field.getAnnotation(Column.class);
                    map.put(columnName.name(),value1+","+value2);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 日志操作
     * @param joinPoint
     */
    private void opLog(ProceedingJoinPoint joinPoint){

    }

}
