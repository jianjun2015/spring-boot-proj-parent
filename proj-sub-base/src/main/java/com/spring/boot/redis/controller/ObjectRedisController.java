package com.spring.boot.redis.controller;

import com.spring.boot.redis.domain.Person;
import com.spring.boot.redis.domain.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjianjun on 2017/9/22.
 */
@RestController
public class ObjectRedisController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping("/setPerson")
    public void setPerson(String id,String name,Integer age){
        personDao.save(new Person(id,name,age));
    }

    @RequestMapping("/getPerson/{id}")
    public Person getPerson(@PathVariable("id") String id){
        return personDao.getPerson(id);
    }
}
