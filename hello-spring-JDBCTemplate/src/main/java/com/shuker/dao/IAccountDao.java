package com.shuker.dao;

import com.shuker.domain.Account;

/**
 * @ClassName IAccountDao
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/8 23:04
 * @Version 1.0
 **/
public interface IAccountDao {
    /**
     * @Description:根据ID查询账户
     * @Author:Shuker
     * @Date: 2020/12/8 23:05
     * @param id:
     * @return: com.shuker.domain.Account
     **/
    Account findAccountById(Integer id ) ;

    /**
     * @Description:根据name查询账户
     * @Author:Shuker
     * @Date: 2020/12/8 23:05
     * @param name:
     * @return: com.shuker.domain.Account
     **/
    Account findAccountByName(String name  ) ;

    /**
     * @Description:更新账户
     * @Author:Shuker
     * @Date: 2020/12/8 23:06
     * @param acount:
     * @return: void
     **/
    void updateAccount(Account acount) ;
}
