package com.spring.boot.controller;

import com.spring.boot.entity.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjianjun on 2017/9/27.
 */
@RestController
@EnableConfigurationProperties({UserBean.class})
public class ConfigWithBean {

    @Autowired
    private UserBean userBean;

    @RequestMapping("/getUserBean")
    public String getUserBean(){
        return userBean.getName()+" "+ userBean.getAge()+" "+userBean.getNumber();
    }
}
