package com.lty;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = {("com.lty.dao")})
public class SpringBoot07MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot07MybatisApplication.class, args);
    }

}
