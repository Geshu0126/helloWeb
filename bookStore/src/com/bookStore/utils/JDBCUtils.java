package com.bookStore.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @ClassName JDBCUtils
 * @Description TODO 数据库工具类  德鲁伊(druid) 运用阿里的数据库连接池技术
 * @Author Shuker
 * @Date 2020/11/4 22:20
 * @Version 1.0
 **/
public class JDBCUtils {
    //数据库连接池的静态实例变量
    private static DruidDataSource dataSource;

    static {
        try {
            //通过当前线程去拿到类加载器，去读取src下的properties的配置文件
            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties");

            Properties properties = new Properties();
//通过流的形式加载数据
            properties.load(inputStream);
            //创建数据库连接池
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*
     * @Description:获取数据库连接对象
     * @Author:Shuker
     * @Date: 2020/11/4 22:32
     * @return: java.sql.Connection
     **/
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    /*
     * @Description: 关闭数据库连接
     * @Author:Shuker
     * @Date: 2020/11/4 22:29
     * @param conn:
     * @return: void
     **/
    public static void closeRersource(Connection conn) {
        if(conn != null ){}
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
