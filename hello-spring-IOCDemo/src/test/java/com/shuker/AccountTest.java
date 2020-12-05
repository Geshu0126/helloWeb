package com.shuker;

import com.shuker.domain.Account;
import com.shuker.service.IAccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName AccountTest
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/5 15:00
 * @Version 1.0
 **/
public class AccountTest {

    @Test
    public void findAll(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = classPathXmlApplicationContext.getBean("accountService", IAccountService.class);
        List<Account> allAccount = accountService.findAllAccount();
        for (Account account : allAccount){
            System.out.println(account);
        }
    }

    @Test
    public void findById(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService service = context.getBean("accountService", IAccountService.class);
        Account account = service.findAccountById(2);
        System.out.println(account);
    }
    @Test
    public void saveAccount(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService service = context.getBean("accountService", IAccountService.class);
        Account account = new Account();
        account.setMoney(10000f);
        account.setName("葛舒");
        int i = service.saveAccount(account);
        System.out.println(i==1?"添加成功":"添加失败");
    }
    @Test
    public void updateAccount(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = context.getBean("accountService", IAccountService.class);
        Account account = new Account();
        account.setId(4);
        account.setMoney(10000f);
        account.setName("晴天");
        accountService.updateAccount(account);
    }

    @Test
    public void deleteByid(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = context.getBean("accountService", IAccountService.class);
        int i = accountService.deleteAccountById(4);
        System.out.println(i==1?"删除成功":"删除失败");
    }
}
