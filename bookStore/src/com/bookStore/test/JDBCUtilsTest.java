package com.bookStore.test;

import com.bookStore.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class JDBCUtilsTest {
    /*
     * @Description:通过数据库连接池获取数据库连接对象测试成功
     * @Author:Shuker
     * @Date: 2020/11/4 22:52

     * @return: void
     **/
    @Test
    public void getConnection() {
        for (int i = 0; i <100 ; i++) {
            Connection connection = JDBCUtils.getConnection();
            System.out.println(connection);
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    /*
     * @Description:关闭数据库连接对象测试成功
     * @Author:Shuker
     * @Date: 2020/11/4 22:54

     * @return: void
     **/
    @Test
    public void closeRersource() {
        //获取一个数据库连接对象
        Connection connection = JDBCUtils.getConnection();
        JDBCUtils.closeRersource(connection);
    }
}