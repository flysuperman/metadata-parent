
package com.sailing.bdip.metadata.common.tool;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * 类名称：ExceptionTool
 * 类描述：异常工具类
 * 创建人：wanggang
 * 创建时间：2017年12月4日 下午1:58:45
 * 修改人：wanggang
 * 修改时间：2017年12月4日 下午1:58:45
 * 修改备注：
 */
public class ExceptionUtil {

    /**
     * 异常默认输出长度,默认长度1300个字符
     */
    public static final Integer EXCEPTION_DEFAULT_LENGTH = 1500;

    /**
     * 
     * exeptionToString[输出异常信息]
     * 创建人:  wanggang
     * 创建时间: 2017年12月4日 下午2:40:19
     * @param ex 异常对象
     * @return 字符串格式异常
     * @since  CodingExample　Ver(编码范例查看) 1.1
     */
    public static String exeptionToString(Throwable ex){
        StringWriter stringWriter = new StringWriter();
        ex.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
    
    /**
     * 
     * exeptionToString[输出指定长度的异常信息]
     * 创建人:  wanggang
     * 创建时间: 2017年12月4日 下午2:39:52
     * @param ex 异常对象
     * @param length 输出异常长度
     * @return 字符串格式异常
     * @since  CodingExample　Ver(编码范例查看) 1.1
     */
    public static String exeptionToString(Throwable ex,int length){
        String result = exeptionToString(ex);
        if(StringUtils.isNotBlank(result) && result.length()>length){
           return result.substring(0,length);
        }else{
            return result;
        }
    }
}

