package com.phil.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping("dqf")
    public String hello() {
        return "Hello World";
    }

}
