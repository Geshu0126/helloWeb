package com.shuker.test;

import com.shuker.dao.ItemsDao;
import com.shuker.domain.Items;
import com.shuker.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName ItemsTest
 * @Description TODO
 * @Author Shuker
 * @Date 2021/1/1 11:19
 * @Version 1.0
 **/
public class ItemsTest {

    @Test
    public void findById(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ItemsDao itemsDao = context.getBean(ItemsDao.class);
        /*Items items = itemsDao.findById(1);
        System.out.println(items);
        */
        ItemsService service = context.getBean(ItemsService.class);
        Items items = service.findById(1);
        System.out.println(items);
    }
}
