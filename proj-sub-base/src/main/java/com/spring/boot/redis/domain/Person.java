package com.spring.boot.redis.domain;

import java.io.Serializable;

/**
 * Created by wangjianjun on 2017/9/22.
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -4439925128966569658L;

    private String id;
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
