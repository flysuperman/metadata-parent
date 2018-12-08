package com.sailing.bdip.metadata;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class MetadataManageApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(MetadataManageApplication.class, args);
    }
}
