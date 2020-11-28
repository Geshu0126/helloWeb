package com.shuker.dao.impl;

import com.shuker.dao.EmployeeDao;
import com.shuker.pojo.Employee;
import com.shuker.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @ClassName EmployeedaoImpl
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/28 16:24
 * @Version 1.0
 **/
public class EmployeedaoImpl implements EmployeeDao {
    /**
     * @Description: 查詢所有的僱員
     * @Author:Shuker
     * @Date: 2020/11/28 12:49
     * @return: java.util.List<com.shuker.pojo.Employee>
     **/
    @Override
    public List<Employee> queryEmployees() {
        //获取sqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //根据这个去定位要执行的sql
        String statment = "com.shuker.dao.EmployeeDao.queryEmployees";
        //执行查询方法，获取到查询集合
        List<Employee> employees = sqlSession.selectList(statment);
        //session关闭
        sqlSession.close();
        return employees;
    }

    @Override
    public int insertEmloyee(Employee employee) {
        //获取sqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //根据这个去定位要执行的sql
        String statment = "com.shuker.dao.EmployeeDao.insertEmployee";
        //执行查询方法，获取到查询集合
        int employees = sqlSession.insert(statment,employee);
        //提交事务
        sqlSession.commit();
        //关闭session
        sqlSession.close();
        return employees;
    }
}
