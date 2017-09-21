package com.spring.boot.mongodb.dao;

import com.spring.boot.mongodb.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by wangjianjun on 2017/9/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void saveUser() throws Exception {
        UserEntity user=new UserEntity();
        user.setId(2l);
        user.setUserName("小明");
        user.setPassWord("fffooo123");
        userDao.saveUser(user);
    }

    @Test
    public void findUserByUserName() throws Exception {
        UserEntity user= userDao.findUserByUserName("小明");
        System.out.println("user is "+user);
    }

    @Test
    public void updateUser() throws Exception {
        UserEntity user=new UserEntity();
        user.setId(2l);
        user.setUserName("天空");
        user.setPassWord("fffxxxx");
        userDao.updateUser(user);
    }

    @Test
    public void deleteUserById() throws Exception {
    }

}