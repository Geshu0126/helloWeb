package com.shuker;

import com.shuker.dao.IRoleDao;
import com.shuker.dao.IUserDao;
import com.shuker.domain.Role;
import com.shuker.domain.User1;
import com.shuker.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName TestRole
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/1 23:45
 * @Version 1.0
 **/
public class TestRole {

    @Test
    public void testFindAll(){
        SqlSession session = MybatisUtils.getSession();
        IRoleDao dao = session.getMapper(IRoleDao.class);
        List<Role> all = dao.findAll();
        for (Role role:all){
            System.out.println(role);
            System.out.println(role.getUsers());
        }

    }

    @Test
    public void testFindAllUser(){
        SqlSession session = MybatisUtils.getSession();
        IUserDao dao = session.getMapper(IUserDao.class);
        List<User1> all = dao.findAll();
        for (User1 user1:all){
            System.out.println(user1);
            System.out.println(user1.getRoles());
        }

    }

}
