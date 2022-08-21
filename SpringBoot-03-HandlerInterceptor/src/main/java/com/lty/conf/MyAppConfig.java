package com.lty.conf;

import com.lty.Interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {


    /**
     *
     * 类似与springmvc中的，springmvc。xml中增加一个拦截器声明
     *
     *
     *<mvc:interceptors>
     * 	<mvc:interceptor>
     *     	<mvc:path="url" />
     *         <bean class="拦截器类全限定名称"/>
     *     </mvc:interceptor>
     * </mvc:interceptors>
     *
     *
     * 注入拦截器使用方法就可以了 不需要@Bean注入
     * @param registry
     */

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor handlerInterceptor = new LoginInterceptor();
        String[] path = {"/user/**"};
        String excludePath []= {"/user/login"};
        registry.addInterceptor(handlerInterceptor).addPathPatterns(path).excludePathPatterns(excludePath);
    }

}
