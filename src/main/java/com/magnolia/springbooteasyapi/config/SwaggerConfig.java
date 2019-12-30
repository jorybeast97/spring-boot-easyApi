package com.magnolia.springbooteasyapi.config;


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
 * @author fanhao
 * Swagger2配置文件
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 创建API UI界面，扫描Controller包下所有Contoller
     * @return
     */
    @Bean
    public Docket creatRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.magnolia.springbooteasyapi.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 配置Swagger2相关的信息内容
     * @return
     */
    public ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("Easy API")
                .description("一个基于Spring Boot所构建简易的RESTful API框架")
                .termsOfServiceUrl("www.magnoliaory.com")
                .contact(new Contact("Jorybeast97", null, "jorybeast97@foxmail.com"))
                .build();
    }

}
