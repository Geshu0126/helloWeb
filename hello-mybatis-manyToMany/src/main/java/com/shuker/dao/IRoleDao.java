package com.shuker.dao;

import com.shuker.domain.Role;

import java.util.List;

/**
 * @ClassName IRoleDao
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/1 23:35
 * @Version 1.0
 **/
public interface IRoleDao {
    /**
     * @Description:查询所有的权限信息
     * @Author:Shuker
     * @Date: 2020/12/1 23:35

     * @return: java.util.List<com.shuker.domain.Role>
     **/
    List<Role> findAll();
}
