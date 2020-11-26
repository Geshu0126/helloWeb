package com.shuker.test;

import com.shuker.dao.EmployeeMapper;
import com.shuker.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName Mybatistest
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/24 13:02
 * @Version 1.0
 **/
public class Mybatistest {
    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "conf/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
               return new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void mybatisHelloWorld() throws IOException {
        String resource = "conf/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            Employee employee =  sqlSession.selectOne("com.shuker.dao.EmployeeMapper.getEmployeeById", 1);
            System.out.println(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

            sqlSession.close();
        }
    }

    @Test
    public void dongTai() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee byId = mapper.getEmployeeById(1);
        System.out.println(byId);
        

    }
}
