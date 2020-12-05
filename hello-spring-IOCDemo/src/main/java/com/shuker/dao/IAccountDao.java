package com.shuker.dao;

import com.shuker.domain.Account;

import java.util.List;

/**
 * @ClassName IAccountDao 账户持久层
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/5 14:33
 * @Version 1.0
 **/
public interface IAccountDao {
    /**
     * @Description:查询所有账户
     * @Author:Shuker
     * @Date: 2020/12/5 14:26

     * @return: java.util.List<Account>
     **/
    List<Account> findAllAccount();

    /**
     * @Description:通过id查询
     * @Author:Shuker
     * @Date: 2020/12/5 14:29
     * @param id:
     * @return: com.shuker.domain.Account
     **/
    Account findAccountById(Integer id) ;

    /**
     * @Description:保存账户
     * @Author:Shuker
     * @Date: 2020/12/5 14:30
     * @param account:
     * @return: int
     **/
    int saveAccount(Account account);
    /**
     * @Description:更新账户
     * @Author:Shuker
     * @Date: 2020/12/5 14:30
     * @param account:
     * @return: int
     **/
    int updateAccount(Account account);

    /**
     * @Description:通过账户id删除
     * @Author:Shuker
     * @Date: 2020/12/5 14:31
     * @param id:
     * @return: int
     **/
    int deleteAccountById(Integer id);
}
