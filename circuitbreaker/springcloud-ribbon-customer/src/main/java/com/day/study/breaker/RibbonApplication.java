package com.day.study.breaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker         // 开启断路器功能，进行容错管理
@EnableDiscoveryClient        // 开启服务发现功能
@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class RibbonApplication {

    /**
     * 注册一个具有容错功能的RestTemplate
     *
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 开启负载均衡客户端
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

}