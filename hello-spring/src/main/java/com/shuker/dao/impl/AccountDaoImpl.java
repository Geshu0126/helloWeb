package com.shuker.dao.impl;

import com.shuker.dao.IAccountDao;

/**
 * @ClassName AccountDaoImpl
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/3 22:01
 * @Version 1.0
 **/
public class AccountDaoImpl implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("用户保存操作执行了");
    }
}
