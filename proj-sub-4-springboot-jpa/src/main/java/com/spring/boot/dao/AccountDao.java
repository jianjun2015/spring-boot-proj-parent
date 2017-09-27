package com.spring.boot.dao;

import com.spring.boot.entity.AccountInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wangjianjun on 2017/9/27.
 */
public interface AccountDao extends JpaRepository<AccountInfo,Integer> {
}
