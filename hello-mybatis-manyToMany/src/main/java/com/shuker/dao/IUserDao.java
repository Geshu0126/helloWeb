package com.shuker.dao;

import com.shuker.domain.User1;

import java.util.List;

/**
 * @ClassName IUserDao
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/2 0:22
 * @Version 1.0
 **/
public interface IUserDao {
    List<User1> findAll() ;
}
