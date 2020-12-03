package com.shuker.service.impl;

import com.shuker.dao.IAccountDao;
import com.shuker.dao.impl.AccountDaoImpl;
import com.shuker.service.AccountService;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/3 21:58
 * @Version 1.0
 **/
public class AccountServiceImpl implements AccountService {
    private IAccountDao accountDao = new AccountDaoImpl();
    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
