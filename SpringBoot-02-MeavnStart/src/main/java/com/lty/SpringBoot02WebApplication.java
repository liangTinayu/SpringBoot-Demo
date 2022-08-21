package com.lty;

import com.lty.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot02WebApplication implements CommandLineRunner {

    public static void main(String[] args) {

        System.out.println("main中的run之前");
        ConfigurableApplicationContext ctx =  SpringApplication.run(SpringBoot02WebApplication.class, args);
        System.out.println("main中的run之后");
        UserService userService = (UserService) ctx.getBean("userServiceImpl");
        userService.sayHello();
        System.out.println("main中的最后");
    }

    @Override
    public void run(String... args) throws Exception {//关键是看该方法与main中的run的执行顺序
        System.out.println("implement CommandLineRunner 中的run");
    }
}
