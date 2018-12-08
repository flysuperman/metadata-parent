
package com.sailing.bdip.metadata;

import com.sailing.bdip.metadata.common.Constants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * 类名称：Swagger2Configuration
 * 类描述：Swagger2 用于生产restful的API
 * 访问地址：http://127.0.0.1:8002/swagger-ui.html
 * 创建人：wanggang
 * 创建时间：2018年6月4日 下午3:11:01
 * 修改人：wanggang
 * 修改时间：2018年6月4日 下午3:11:01
 * 修改备注：
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {
    
    @Bean
    public Docket accessToken() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("api")// 定义组
                .select() // 选择那些路径和 api 会生成 document
                .apis(RequestHandlerSelectors.basePackage(Constants.SWAGGER_BASEPACKAGE)) // 拦截的包路径
                .paths(PathSelectors.regex("/*/.*"))// 拦截的接口路径
                .build() // 创建
                .apiInfo(apiInfo()); // 配置说明
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()//
                .title("Spring Boot 之 Web 篇")// 标题
                .description("spring boot Web 相关内容")// 描述
                .termsOfServiceUrl("http://www.extlight.com")//
                .contact(new Contact("moonlightL", "http://www.extlight.com", "445847261@qq.com"))// 联系
                .version("1.0")// 版本
                .build();
    }
}

