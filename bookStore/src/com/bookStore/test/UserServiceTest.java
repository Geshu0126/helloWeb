package com.bookStore.test;

import com.bookStore.pojo.User;
import com.bookStore.service.UserService;
import com.bookStore.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {
    UserService userService = new UserServiceImpl();
    @Test
    public void registUser() {
        userService.registUser(new User( null,"周杰伦","zhoujielun","zhoujielun@aa.com"));
    }

    @Test
    public void login() {
        User user = userService.login(new User(null,"admin", "admin", null));
        System.out.println(user);
    }

    @Test
    public void existsUser() {
        String username = "周杰伦";
        boolean result = userService.existsUser(username);
        if(result){
            System.out.println("用户名已经存在");
        }else{
            System.out.println("用户名不存在，当前可用");
        }
    }
}