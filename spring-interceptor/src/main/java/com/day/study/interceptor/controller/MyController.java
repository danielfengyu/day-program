package com.day.study.interceptor.controller;

import com.day.study.interceptor.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengyu
 */
@RestController
public class MyController {
    @GetMapping("/user")
    public User findUser() {
        User user = new User();
        user.setAge(11);
        user.setName("冯玉");
        return user;
    }
}
