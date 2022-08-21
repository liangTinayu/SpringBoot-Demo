package com.lty.conf;

import com.lty.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebApplicationConfig {

    @Bean
    public ServletRegistrationBean addServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(),"/login","/test");
//        bean.setServlet();
//        bean.addUrlMappings("","");
        return  bean;
    }
}
