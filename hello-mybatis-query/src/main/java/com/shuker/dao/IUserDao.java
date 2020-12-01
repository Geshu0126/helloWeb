package com.shuker.dao;

import com.shuker.domain.User;

import java.util.List;

/**
 * @ClassName IUserDao
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/1 21:14
 * @Version 1.0
 **/
public interface IUserDao {

    public List<User> findAll();
}
