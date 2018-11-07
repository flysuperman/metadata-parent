package com.sailing.bdip.metadata.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 该配置和配置文件里面一样的
 */
@Configuration
public class MybatisConfiguration {

//    @Bean
//    public PageHelper pageHelper(){
//        System.out.println("mybatis MybatisConfiguration.pageHelper()");
//        PageHelper pageHelper=new PageHelper();
//        Properties p=new Properties();
//        p.setProperty("offsetAsPageNum", "true");
//        p.setProperty("rowBoundsWithCount", "true");
//        pageHelper.setProperties(p);
//        return pageHelper;
//    }
}