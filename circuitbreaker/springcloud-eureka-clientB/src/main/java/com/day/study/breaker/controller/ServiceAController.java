package com.day.study.breaker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengyu
 */
@RestController
public class ServiceAController {

    @RequestMapping("/hello")
    public String testA() {
        return "Hello world BBBBBBBB!";
    }
}