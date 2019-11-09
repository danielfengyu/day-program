package com.day.study.interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author fengyu
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages = "com.day.study.interceptor")
public class SpringInterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringInterceptorApplication.class, args);
    }

}
