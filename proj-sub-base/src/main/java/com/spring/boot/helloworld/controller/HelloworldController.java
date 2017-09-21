package com.spring.boot.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjianjun on 2017/9/21.
 */
@RestController
public class HelloworldController {

    @RequestMapping("/getHello")
    public String getHello(){
        return "hello world ... ";
    }
}
