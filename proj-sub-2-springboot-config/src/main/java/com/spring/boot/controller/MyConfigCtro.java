package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjianjun on 2017/9/27.
 */
@RestController
public class MyConfigCtro {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private int age;

    @Value("${info.address}")
    private String addr;

    @RequestMapping("/show")
    public String showConfig(){
        return name+" "+age+" "+addr;
    }
}
