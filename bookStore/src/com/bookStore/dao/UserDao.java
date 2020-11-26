package com.bookStore.dao;

import com.bookStore.pojo.User;

/**
 * @ClassName UserDao
 * @Description TODO 用户操作的dao
 * @Author Shuker
 * @Date 2020/11/5 18:32
 * @Version 1.0
 **/
public interface UserDao {
    /**
     * @Description:通过用户名查询用户信息
     * @Author:Shuker
     * @Date: 2020/11/5 18:33
     * @param username:  输入的用户名
     * @return: com.bookStore.pojo.User 返回的用户对象信息 如果返回null说明用户名可用，反之亦然
     **/

    public User queryByUserName(String username);
    /**
     * @Description:通过用户名和密码查询用户信息
     * @Author:Shuker
     * @Date: 2020/11/5 18:35
     * @param username: 输入的用户名
     * @param password:  输入的用户密码
     * @return: com.bookStore.pojo.User 返回的用户对象信息，如果返回null，说明用户密码输入错误
     **/

    public User queryByUsernameAndPassword(String username,String password );

    /**
     * @Description: 保存用户信息
     * @Author:Shuker
     * @Date: 2020/11/5 18:37

     * @return: int 返回-1 说明保存失败，反之亦然
     **/

    public int saveUser(User user);


}
