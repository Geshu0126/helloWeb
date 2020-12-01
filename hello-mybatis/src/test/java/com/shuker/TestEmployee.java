package com.shuker;


import com.shuker.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName TestEmployee
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/28 13:06
 * @Version 1.0
 **/
public class TestEmployee {

    @Test
    public  void testInsert() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Employee employee = new Employee();
        employee.setLastName("qingtian");
        employee.setEmail("qingtian@111.com");
        employee.setGender('0');
        int i = sqlSession.insert("com.shuker.dao.EmployeeDao.insertEmployee", employee);
        sqlSession.commit();
        System.out.println("受影响的行数="+i);

    }
    @Test
    public  void testQueryAll() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession();
        List<Employee> employees = sqlSession.selectList("com.shuker.dao.EmployeeDao.queryEmployees");
        for (Employee emp: employees
             ) {
            System.out.println(emp);
        }
        sqlSession.close();

    }
}
