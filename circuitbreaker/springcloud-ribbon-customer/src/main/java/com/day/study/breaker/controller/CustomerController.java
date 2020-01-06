package com.day.study.breaker.controller;

import com.day.study.breaker.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    HelloService service;

    @RequestMapping("/hello")
    public String customer(){
        return service.helloService();
    }
}