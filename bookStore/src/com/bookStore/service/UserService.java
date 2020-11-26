package com.bookStore.service;

import com.bookStore.pojo.User;

/**
 * @ClassName UserService
 * @Description TODO 关于用户业务层
 * @Author Shuker
 * @Date 2020/11/5 19:10
 * @Version 1.0
 **/
public interface UserService {

    /**
     * @Description: 用户注册
     * @Author:Shuker
     * @Date: 2020/11/5 19:11
     * @param user:  要注册的用户信息
     * @return: void
     **/
    public void registUser(User user);

    /***
     * @Description:用户登录
     * @Author:Shuker
     * @Date: 2020/11/5 19:12
     * @param user:  登录用户的信息
     * @return: com.bookStore.pojo.User 返回登录用户的信息
     **/
    public User login(User user);

    /**
     * @Description:查询用户是否存在
     * @Author:Shuker
     * @Date: 2020/11/5 19:13
     * @param username:  要查询的用户名
     * @return: boolean true 用户存在 反之亦然
     **/
    public boolean existsUser(String username);
}
