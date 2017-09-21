package com.spring.boot.mongodb.dao;


import com.spring.boot.mongodb.entity.UserEntity;

/**
 * Created by wangjianjun on 2017/8/22.
 */
public interface UserDao {

    public void saveUser(UserEntity user);

    public UserEntity findUserByUserName(String userName);

    public int updateUser(UserEntity user);

    public void deleteUserById(Long id);

}
