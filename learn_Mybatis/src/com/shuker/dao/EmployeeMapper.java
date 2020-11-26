package com.shuker.dao;

import com.shuker.pojo.Employee;

/**
 * @ClassName EmployeeMapper
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/24 13:49
 * @Version 1.0
 **/
public interface EmployeeMapper {
    /**
     * @Description:通过id查employee对象
     * @Author:Shuker
     * @Date: 2020/11/24 13:49
     * @param id:
     * @return: com.shuker.pojo.Employee
     **/
    public Employee getEmployeeById(Integer id) ;
}
