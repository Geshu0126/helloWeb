package com.shuker.service;

import com.shuker.domain.Account;

import java.util.List;

/**
 * @ClassName AccountService
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/20 20:32
 * @Version 1.0
 **/
public interface AccountService {

    /**
     * @Description:查询所有
     * @Author:Shuker
     * @Date: 2020/12/20 20:32

     * @return: java.util.List<com.shuker.domain.Account>
     **/
    List<Account> findAll();

    /**
     * @Description:保存用户
     * @Author:Shuker
     * @Date: 2020/12/20 20:33
     * @param account:
     * @return: void
     **/
    void saveAccount(Account account);

}
