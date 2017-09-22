package com.spring.boot.helloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjianjun on 2017/9/21.
 */
@RestController
public class HelloworldController {

    Logger logger = LoggerFactory.getLogger(HelloworldController.class);

    @RequestMapping("/getHello")
    public String getHello(){
        logger.info("getHello");
        return "hello world ... ";
    }

    @RequestMapping("getMsg/{msg}")
    public String getMsg(@PathVariable("msg") String msg){
        logger.info("getMsg");
        return "MSG:"+msg;
    }
}
