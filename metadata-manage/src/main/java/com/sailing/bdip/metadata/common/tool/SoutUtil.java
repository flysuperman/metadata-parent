package com.sailing.bdip.metadata.common.tool;

import java.util.Date;

/**
 * sysout输出
 */
public class SoutUtil {

    /**
     * 输出方法
     * @param msg
     */
    public static void out(String msg){
        System.out.println(new Date()+":"+msg);
    }
}
