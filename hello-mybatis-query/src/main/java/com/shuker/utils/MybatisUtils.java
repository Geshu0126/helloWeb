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
 * @Date 2020/12/1 20:05
 * @Version 1.0
 **/
public class MybatisUtils {
    private static SqlSessionFactory factory = null ;
    static {
        String config = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(config);
            factory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        SqlSession session = null ;
        if(factory != null){
            session = factory.openSession();
        }
        return session ;
    }
}
