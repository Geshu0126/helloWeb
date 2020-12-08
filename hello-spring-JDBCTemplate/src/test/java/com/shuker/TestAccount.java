package com.shuker;

import com.shuker.domain.Account;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName TestAccount
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/8 22:38
 * @Version 1.0
 **/
public class TestAccount {
    @Test
    public void testExecute(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate bean = context.getBean("jdbcTemplate", JdbcTemplate.class);
        //执行插入操作
        //bean.update("insert into account1(name,money)values('田',1000)");
        //执行更新操作
        //执行删除
        int i = bean.update("delete from account1 where id = 9");
        /*int i = bean.update("update account1 set name = 'tiantiande',money=2000 where id =6 ");*/
        System.out.println(i==1?"操作成功":"操作失败");
    }

    @Test
    public void testQuery(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate bean = context.getBean("jdbcTemplate", JdbcTemplate.class);
        List<Account> list = bean.query("select * from account1 where money >?", new MyRowMapper(), 100);
        for (Account account : list){
            System.out.println(account);
        }
    }

    @Test
    public void testQuery1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate bean = context.getBean("jdbcTemplate", JdbcTemplate.class);
        List<Account> list = bean.query("select * from account1 where money >?", new BeanPropertyRowMapper<>(Account.class), 100);
        for (Account account : list){
            System.out.println(account);
        }
    }
}
class MyRowMapper implements RowMapper<Account>{

    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setId(resultSet.getInt("id"));
        account.setName(resultSet.getString("name"));
        account.setMoney(resultSet.getFloat("money"));
        return account;
    }
}