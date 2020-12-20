package com.shuker.service.impl;

import com.shuker.dao.AccountDao;
import com.shuker.domain.Account;
import com.shuker.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/20 20:33
 * @Version 1.0
 **/
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    /**
     * @Description:查询所有
     * @Author:Shuker
     * @Date: 2020/12/20 20:32
     * @return: java.util.List<com.shuker.domain.Account>
     **/
    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有的信息");

        return accountDao.findAll();
    }

    /**
     * @param account :
     * @Description:保存用户
     * @Author:Shuker
     * @Date: 2020/12/20 20:33
     * @return: void
     **/
    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存账户");
        accountDao.saveAccount(account);
    }
}
