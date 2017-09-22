package com.spring.boot.redis.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by wangjianjun on 2017/9/22.
 */
@Repository
public class PersonDao {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Resource(name = "redisTemplate")
    private ValueOperations<Object,Object> valueOperations;

    public void save(Person person){
        valueOperations.set(person.getId(),person);
    }

    public Person getPerson(String id){
        return (Person) valueOperations.get(id);
    }
}
