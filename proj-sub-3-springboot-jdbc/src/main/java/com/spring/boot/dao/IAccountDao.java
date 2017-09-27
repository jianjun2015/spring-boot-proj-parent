package com.spring.boot.dao;

import com.spring.boot.entity.Account;

import java.util.List;

/**
 * Created by wangjianjun on 2017/9/27.
 */
public interface IAccountDao {

    int add(Account account);
    int update(Account account);
    public int delete(int id);
    Account findAccountById(int id);
    List<Account> findAccountList();
}
