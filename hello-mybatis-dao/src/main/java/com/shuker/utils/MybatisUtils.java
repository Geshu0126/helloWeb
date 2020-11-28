package com.shuker.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName MybatisUtils
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/28 16:25
 * @Version 1.0
 **/
public class MybatisUtils {
    private static SqlSessionFactory sessionFactory= null ;
    static {
        String config = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(config);
            sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null ;
        if(sessionFactory != null){
            sqlSession = sessionFactory.openSession();
        }
        return sqlSession ;
    }
}
