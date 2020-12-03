package com.shuker.ui;

import com.shuker.dao.IAccountDao;
import com.shuker.service.AccountService;
import com.shuker.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Client
 * @Description TODO 模拟客户端
 * @Author Shuker
 * @Date 2020/12/3 21:55
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
      /*  AccountService accountService = new AccountServiceImpl() ;
        accountService.saveAccount();*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = (AccountService)applicationContext.getBean("accountService");
        System.out.println(service);
        IAccountDao dao = applicationContext.getBean("accountDao", IAccountDao.class);
        System.out.println(dao);
    }
}
