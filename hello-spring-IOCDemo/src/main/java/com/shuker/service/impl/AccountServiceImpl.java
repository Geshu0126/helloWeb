package com.shuker.service.impl;

import com.shuker.dao.IAccountDao;
import com.shuker.domain.Account;
import com.shuker.service.IAccountService;

import java.util.List;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO 业务层的实现类
 * @Author Shuker
 * @Date 2020/12/5 14:32
 * @Version 1.0
 **/
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao  ;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     * @Description:查询所有账户
     * @Author:Shuker
     * @Date: 2020/12/5 14:26
     * @return: java.util.List<Account>
     **/
    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    /**
     * @param id :
     * @Description:通过id查询
     * @Author:Shuker
     * @Date: 2020/12/5 14:29
     * @return: com.shuker.domain.Account
     **/
    @Override
    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    /**
     * @param account :
     * @Description:保存账户
     * @Author:Shuker
     * @Date: 2020/12/5 14:30
     * @return: int
     **/
    @Override
    public int saveAccount(Account account) {
        return accountDao.saveAccount(account);
    }

    /**
     * @param account :
     * @Description:更新账户
     * @Author:Shuker
     * @Date: 2020/12/5 14:30
     * @return: int
     **/
    @Override
    public int updateAccount(Account account) {
        return accountDao.updateAccount(account);
    }

    /**
     * @param id :
     * @Description:通过账户id删除
     * @Author:Shuker
     * @Date: 2020/12/5 14:31
     * @return: int
     **/
    @Override
    public int deleteAccountById(Integer id) {
        return accountDao.deleteAccountById(id);
    }
}
