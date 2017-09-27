package com.spring.boot.service;

import com.spring.boot.entity.Account;

import java.util.List;

/**
 * Created by wangjianjun on 2017/9/27.
 */
public interface IAccountService {

    int add(String name, double money);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
