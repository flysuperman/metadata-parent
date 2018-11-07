package com.sailing.bdip.metadata;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MetadataManageApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(MetadataManageApplication.class, args);
        System.out.println("MetadataManageApplication running...");

    }
}
