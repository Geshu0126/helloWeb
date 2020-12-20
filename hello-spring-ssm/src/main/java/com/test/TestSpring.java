package com.test;

import com.shuker.service.AccountService;
import com.shuker.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestSpring
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/20 20:40
 * @Version 1.0
 **/
public class TestSpring {
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService impl = applicationContext.getBean("accountService", AccountService.class);
        //调用方法
        impl.findAll();
    }
}
