package com.spring.boot.controller;

import com.spring.boot.entity.InfoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjianjun on 2017/9/27.
 */
@RestController
@EnableConfigurationProperties({InfoUser.class})
public class ControllerWithProperties {

    @Autowired
    private InfoUser infoUser;

    @RequestMapping("/getInfo")
    public String getInfo(){
        return infoUser.getUser()+" " +infoUser.getAge();
    }
}
