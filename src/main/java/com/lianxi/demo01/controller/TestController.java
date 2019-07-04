package com.lianxi.demo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String test(){
        return "欢迎来学习springboot基础项目";
    }
}
