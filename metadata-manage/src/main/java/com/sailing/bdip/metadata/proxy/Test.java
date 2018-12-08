package com.sailing.bdip.metadata.proxy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        Performance bean = ac.getBean(Dance.class);
        bean.perform();
    }
}
