package com.lty;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * 第二种方式：@Mapper不再Dao上了 放在了此处进行扫包
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.lty.dao"})
public class SpringBoot05MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot05MybatisApplication.class, args);
    }

}
