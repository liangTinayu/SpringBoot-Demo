package com.lty;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = {"com.lty.dao"})
public class SpringBoot08MybatisGenratorTranscationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot08MybatisGenratorTranscationApplication.class, args);
    }

}
