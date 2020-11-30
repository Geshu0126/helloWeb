package com.shuker.dao;

import com.shuker.pojo.Employee;
import com.shuker.pojo.EmployeeVo;
import org.apache.ibatis.annotations.Param;

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
     * @Description:查詢所有的僱員
     * @Author:Shuker
     * @Date: 2020/11/28 12:49
     * @return: java.util.List<com.shuker.pojo.Employee>
     **/
    public List<Employee> queryEmployees();

    /**
     * @param employee:
     * @Description:插入数据
     * @Author:Shuker
     * @Date: 2020/11/28 18:12
     * @return: int 受影响的行数
     **/
    public int insertEmloyee(Employee employee);

    /***
     * @Description:查询对象通过雇员的id
     * @Author:Shuker
     * @Date: 2020/11/28 18:13
     * @param id:雇员的id
     * @return: com.shuker.pojo.Employee 雇员对象
     **/
    public Employee queryEmpById(Integer id);

    /**
     * @param name:
     * @param id:
     * @Description:使用@param注解查询
     * @Author:Shuker
     * @Date: 2020/11/28 23:02
     * @return: com.shuker.pojo.Employee
     **/
    public Employee queryByParam(@Param("empName") String name, @Param("empId") Integer id);

    /**
     * @param id:
     * @param name:
     * @Description:mapper文件中实现动态sql where
     * @Author:Shuker
     * @Date: 2020/11/28 23:02
     * @return: com.shuker.pojo.Employee
     **/
    public Employee queryEmpByWhere(@Param("id") Integer id, @Param("name") String name);

    /***
     * @Description:mapper文件中实现动态sql foreach
     * @Author:Shuker
     * @Date: 2020/11/28 23:04
     * @param idList:
     * @return: com.shuker.pojo.Employee
     **/
    public List<Employee> queryEmpByForEach(List<Integer> idList);

    /**
     * @param empList:
     * @Description:mapper文件中实现动态sql 参数是对象
     * @Author:Shuker
     * @Date: 2020/11/28 23:20
     * @return: java.util.List<com.shuker.pojo.Employee>
     **/
    public List<Employee> queryEmpByForEachTwo(List<Employee> empList);

    /**
     * @Description:查询全部 运用pagehelper插件实现分页
     * @Author:Shuker
     * @Date: 2020/11/29 9:21
     * @return: java.util.List<com.shuker.pojo.Employee>
     **/
    public List<Employee> queryAll();

    /**
     * @Description:通过employee对象查询
     * @Author:Shuker
     * @Date: 2020/11/30 22:22
     * @return: com.shuker.pojo.Employee
     **/
    Employee findByEmployee(Employee employee);

    /**
     * @Description:模糊查询通过employee对象的lastName属性
     * @Author:Shuker
     * @Date: 2020/11/30 22:42
     * @param employee:
     * @return: java.util.List<com.shuker.pojo.Employee>
     **/
    List<Employee> likeFindByEmployeeLastName(Employee employee);

    /**
     * @Description:通过vo类查询
     * @Author:Shuker
     * @Date: 2020/11/30 22:52
     * @param vo:
     * @return: java.util.List<com.shuker.pojo.Employee>
     **/
    List<Employee> likeFindByEmployeeVo(EmployeeVo vo);
}
