package com.spring.boot.controller;

import com.spring.boot.dao.AccountDao;
import com.spring.boot.entity.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wangjianjun on 2017/9/27.
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountDao accountDao;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<AccountInfo> getAccounts() {
        return accountDao.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public AccountInfo getAccountById(@PathVariable("id") int id) {
        return accountDao.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
        AccountInfo account = new AccountInfo();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        AccountInfo account1 = accountDao.saveAndFlush(account);

        return account1.toString();

    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {
        AccountInfo account = new AccountInfo();
        account.setMoney(money);
        account.setName(name);
        AccountInfo account1 = accountDao.save(account);
        return account1.toString();

    }
}
