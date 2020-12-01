package com.shuker.dao;

import com.shuker.domain.Account;
import com.shuker.domain.AccountUser;

import java.util.List;

/**
 * @ClassName IAccountDao
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/1 19:59
 * @Version 1.0
 **/
public interface IAccountDao {
    /**
     * @Description:查詢所有记录
     * @Author:Shuker
     * @Date: 2020/12/1 19:59

     * @return: java.util.List<com.shuker.domain.Account>
     **/
    List<Account> findAll();

    /**
     * @Description:查询所有账户及其户主信息
     * @Author:Shuker
     * @Date: 2020/12/1 20:49

     * @return: java.util.List<com.shuker.domain.AccountUser>
     **/
    List<AccountUser> findAllAccountUser();
}
