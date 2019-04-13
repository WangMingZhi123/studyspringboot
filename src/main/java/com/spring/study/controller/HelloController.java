package com.spring.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:wisdom
 * **/
@RestController
@RequestMapping("/into")
public class HelloController {

    @RequestMapping("/hello")
    public String say() {
        return "欢迎进入springboot学习";
    }
}
