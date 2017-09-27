package com.spring.boot.service.impl;

import com.spring.boot.dao.AccountMapper;
import com.spring.boot.entity.Account;
import com.spring.boot.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangjianjun on 2017/9/27.
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int add(String name, double money) {
        return accountMapper.add(name, money);
    }

    @Override
    public int update(Account account) {
        return accountMapper.update(account.getName(),account.getMoney(),account.getId());
    }

    @Override
    public int delete(int id) {
        return accountMapper.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountMapper.findAccount(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountMapper.findAccountList();
    }
}
