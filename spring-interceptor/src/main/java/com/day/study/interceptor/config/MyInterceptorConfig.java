package com.day.study.interceptor.config;

import com.day.study.interceptor.filter.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author fy
 */
@Configuration
public class MyInterceptorConfig extends WebMvcConfigurationSupport {
    @Autowired
    private MyFilter filter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则，/**表示拦截所有请求
        // excludePathPatterns 用户排除拦截
        System.out.println("configure filter......");
        registry.addInterceptor(filter);
        super.addInterceptors(registry);
    }
}
