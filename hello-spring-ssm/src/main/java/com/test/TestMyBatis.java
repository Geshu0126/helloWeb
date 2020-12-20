package com.test;

import com.shuker.dao.AccountDao;
import com.shuker.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @ClassName TestMyBatis
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/20 22:31
 * @Version 1.0
 **/
public class TestMyBatis {
    @Test
    public void run1() throws Exception {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SQLSessionFactory,构建者模式
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取到一个sqlsession
        SqlSession session = sessionFactory.openSession();
        //获取到代理对象
        AccountDao accountDao = session.getMapper(AccountDao.class);
        List<Account> accountList = accountDao.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
        session.close();
        inputStream.close();
    }

    @Test
    public void run2() throws Exception {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SQLSessionFactory,构建者模式
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取到一个sqlsession
        SqlSession session = sessionFactory.openSession();
        //获取到代理对象
        AccountDao accountDao = session.getMapper(AccountDao.class);
        Account account1 = new Account();
        account1.setName("tiantingwei");
        account1.setMoney(12220.0);
        accountDao.saveAccount(account1);
        session.commit();
        session.close();
        inputStream.close();
    }
}
