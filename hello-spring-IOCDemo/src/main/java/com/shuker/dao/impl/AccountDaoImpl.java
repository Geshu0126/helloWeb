package com.shuker.dao.impl;

import com.shuker.dao.IAccountDao;
import com.shuker.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName AccountDaoImpl
 * @Description TODO 账户持久层实现类
 * @Author Shuker
 * @Date 2020/12/5 14:35
 * @Version 1.0
 **/
public class AccountDaoImpl implements IAccountDao {
    private QueryRunner runner  ;

    public void setQueryRunner(QueryRunner runner) {
        this.runner = runner;
    }

    /**
     * @Description:查询所有账户
     * @Author:Shuker
     * @Date: 2020/12/5 14:26
     * @return: java.util.List<Account>
     **/
    @Override
    public List<Account> findAllAccount() {
        try {
            return runner.query("select * from account1", new BeanListHandler<>(Account.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
        try {
            return runner.query("select * from account1 where id = ?", new BeanHandler<>(Account.class),id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
        try {
            return runner.update("insert into account1(name,money)values(?,?)",account.getName(),account.getMoney());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
        try {
            return runner.update("update account1 set name= ? , money = ? where id = ?", account.getName(),account.getMoney(),account.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
        try {
            return runner.update("delete from account1 where id = ?", id) ;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
