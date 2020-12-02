package com.shuker;

import com.shuker.dao.IAccountDao;
import com.shuker.domain.Account;
import com.shuker.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @ClassName TestUser
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/2 19:06
 * @Version 1.0
 **/
public class TestAccount {
    public static SqlSession getSession() {
        String config = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession sqlSession = null;
        try {
            inputStream = Resources.getResourceAsStream(config);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            if (factory != null) {
                sqlSession = factory.openSession();
            }
            } catch(Exception e){
                e.printStackTrace();
            }
            return sqlSession;
        }


    @Test
    public void testFindAllByAnnotation() {
        SqlSession session = getSession();
        IAccountDao dao = session.getMapper(IAccountDao.class);
        List<Account> userList = dao.findAll();
        for (Account account : userList){
            System.out.println("-----每个账户的信息-------");
            System.out.println(account);
            System.out.println(account.getUser());
        }

        session.close();
    }



}
