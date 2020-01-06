package com.day.study.breaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudEurekaClientbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaClientbApplication.class, args);
    }
}
