package com.bookStore.test;

import com.bookStore.dao.UserDao;
import com.bookStore.dao.impl.UserDaoImpl;
import com.bookStore.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();
    @Test
    public void queryByUserName() {
        String username = "admin1232" ;
        User user = userDao.queryByUserName(username);
        System.out.println(user);

    }

    @Test
    public void queryByUsernameAndPassword() {
        String username = "admin";
        String password = "admin" ;
        User user = userDao.queryByUsernameAndPassword(username, password);
        System.out.println(user);
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setUsername("geshu");
        user.setPassword("333");
        user.setEmail("geshu@qq.com");
        int i = userDao.saveUser(user);
        System.out.println(i);
    }
}