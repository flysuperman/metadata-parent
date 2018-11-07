package com.sailing.bdip.metadata.common.tool;

import java.util.UUID;

public class RandomUtils {

    /**
     *
     * get32UUIDRandom[32 UUID随机数]
     * 创建人:  wanggang
     * 创建时间: 2018年6月15日 上午10:18:40
     *
     * @Title: get32UUIDRandom
     * @return
     * @since  CodingExample　Ver(编码范例查看) 1.1
     */
    public  static synchronized String get32UUIDRandom(){
        return  UUID.randomUUID().toString().replaceAll("-", "");
    }
}
