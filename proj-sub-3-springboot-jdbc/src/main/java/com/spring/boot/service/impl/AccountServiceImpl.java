package com.spring.boot.service.impl;

import com.spring.boot.dao.IAccountDao;
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
    private IAccountDao accountDao;

    @Override
    public int add(Account account) {
        return accountDao.add(account);
    }

    @Override
    public int update(Account account) {
        return accountDao.update(account);
    }

    @Override
    public int delete(int id) {
        return accountDao.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDao.findAccountList();
    }
}
