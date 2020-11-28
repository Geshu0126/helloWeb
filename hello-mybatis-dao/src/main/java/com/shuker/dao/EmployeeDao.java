package com.shuker.dao;

import com.shuker.pojo.Employee;

import java.util.List;

/**
 * @ClassName EmployeeDao
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/28 12:49
 * @Version 1.0
 **/
public interface EmployeeDao {
    /**
     * @Description: 查詢所有的僱員
     * @Author:Shuker
     * @Date: 2020/11/28 12:49

     * @return: java.util.List<com.shuker.pojo.Employee>
     **/
    public List<Employee> queryEmployees();

    public int insertEmloyee(Employee employee);
}
