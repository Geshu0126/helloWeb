package com.shuker.dao.impl;

import com.shuker.dao.IAccountDao;
import com.shuker.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @ClassName AccountDaoImpl
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/8 23:09
 * @Version 1.0
 **/
public class AccountDaoImpl implements IAccountDao {
    private JdbcTemplate jdbc ;

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    /**
     * @param id :
     * @Description:根据ID查询账户
     * @Author:Shuker
     * @Date: 2020/12/8 23:05
     * @return: com.shuker.domain.Account
     **/
    @Override
    public Account findAccountById(Integer id) {
        List<Account> list = jdbc.query("select * from account1 where id = ?",new BeanPropertyRowMapper<Account>(Account.class),1 );
        return list.isEmpty()?null:list.get(0);
    }

    /**
     * @param name :
     * @Description:根据name查询账户
     * @Author:Shuker
     * @Date: 2020/12/8 23:05
     * @return: com.shuker.domain.Account
     **/
    @Override
    public Account findAccountByName(String name) {
        return null;
    }

    /**
     * @param acount :
     * @Description:更新账户
     * @Author:Shuker
     * @Date: 2020/12/8 23:06
     * @return: void
     **/
    @Override
    public void updateAccount(Account acount) {

    }
}
