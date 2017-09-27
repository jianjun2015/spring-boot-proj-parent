package com.spring.boot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by wangjianjun on 2017/9/27.
 */
@Configuration
@PropertySource(value = "classpath:my.properties")
@ConfigurationProperties(prefix = "com.info")
public class InfoUser {

    private String user;
    private int age;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
