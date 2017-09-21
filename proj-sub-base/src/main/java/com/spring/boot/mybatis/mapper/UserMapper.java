package com.spring.boot.mybatis.mapper;

import com.spring.boot.mybatis.entity.UserEntity;

import java.util.List;

/**
 * Created by wangjianjun on 2017/8/22.
 */
public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}
