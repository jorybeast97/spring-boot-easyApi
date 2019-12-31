package com.magnolia.springbooteasyapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.magnolia.springbooteasyapi.mapper")
public class SpringBootEasyapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEasyapiApplication.class, args);
    }

}
