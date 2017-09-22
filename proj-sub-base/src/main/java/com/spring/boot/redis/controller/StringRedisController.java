package com.spring.boot.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by wangjianjun on 2017/9/22.
 */
@RestController
public class StringRedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource(name = "stringRedisTemplate")
    ValueOperations<String,String> valOpsStr;

    @RequestMapping("/set")
    public String setKeyAndValue(String key,String value){
        valOpsStr.set(key,value);
        return "set ok";
    }

    @RequestMapping("/get")
    public String getKey(String key){
        return valOpsStr.get(key);
    }
}
