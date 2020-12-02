package com.shuker;

import com.shuker.dao.IUserDao;
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
public class TestUser {
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
        IUserDao dao = session.getMapper(IUserDao.class);
        List<User> userList = dao.findAll();
        for (User user : userList){
            System.out.println("-----每一个用户的信息-----");
            System.out.println(user);
            System.out.println(user.getAccounts());
        }

        session.close();
    }
    @Test
    public void testSaveUserByAnnotation() {
        SqlSession session = getSession();
        IUserDao dao = session.getMapper(IUserDao.class);
        User user = new User();
        user.setUserName("qingtian");
        user.setUserAddress("qingtian路");
        user.setUserSex("男");
        dao.saveUser(user);
        session.commit();
        session.close();
    }
    @Test
    public void testUpdateUserByAnnotation() {
        SqlSession session = getSession();
        IUserDao dao = session.getMapper(IUserDao.class);
        User user = new User();
        user.setUserId(49);
        user.setUserName("qingtian");
        user.setUserAddress("qingtian路");
        user.setUserBirthday(new Date());
        user.setUserSex("男");
        dao.updateUser(user);
        session.commit();
        session.close();
    }

    @Test
    public void testDelete(){
        SqlSession session = getSession();
        IUserDao dao = session.getMapper(IUserDao.class);
        int i = dao.deleteUserById(49);
        session.commit();
        System.out.println(i>=0?"删除成功":"删除失败");
    }
}
