package com.spring.boot.dao;

import com.spring.boot.entity.Account;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;

/**
 * Created by wangjianjun on 2017/9/27.
 */
public interface AccountDao extends BaseMapper<Account> {

    @SqlStatement(params = "name")
    Account selectAccountByName(String name);
}
