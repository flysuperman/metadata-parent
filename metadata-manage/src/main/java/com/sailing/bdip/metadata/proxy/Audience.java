package com.sailing.bdip.metadata.proxy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect//声明切面，没有声明的话不会起作用
@Component
public class Audience {
    public Audience(){

    }

    //声明切入点
    //第一个*表示 方法  返回值（例如public int）
    //第二个* 表示方法的全限定名（即包名+类名）
    //perform表示目标方法参数括号两个.表示任意类型参数
    //方法表达式以“*”号开始，表明了我们不关心方法返回值的类型。然后，我们指定了全限定类名和方法名。对于方法参数列表，
    //我们使用两个点号（..）表明切点要选择任意的perform()方法，无论该方法的入参是什么
    //execution表示执行的时候触发
    @Pointcut("execution(* *.perform(..))")
    public void dancepoint(){
        //该方法就是一个标识方法，为pointcut提供一个依附的地方
    }

    @Before("dancepoint()")
    public void beforeDance(){
        System.out.println("找座位。。。。");
    }
    @After("dancepoint()")
    public void afterDance(){
        System.out.println("看完回家");
    }

}