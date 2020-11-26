package com.bookStore.dao;

import com.bookStore.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName BaseDao
 * @Description TODO 一些公共的操作，通用的增删改查的操作
 * @Author Shuker
 * @Date 2020/11/4 22:59
 * @Version 1.0
 **/
public abstract class BaseDao {
    private QueryRunner queryRunner = new QueryRunner();

    /*
     * @Description: 通过QueryRunner 的update方法 来实现 通用的 insert update delete 操作
     * @Author:Shuker
     * @Date: 2020/11/4 23:04
     * @param sql:
     * @param args:
     * @return: int 如果返回 -1 说明操作失败 </br> 返回其他数字是受影响的行数
     **/
    public int update(String sql, Object... args) {
        Connection conn = JDBCUtils.getConnection();

        try {
            return queryRunner.update(conn, sql, args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.closeRersource(conn);
        }
        return -1;
    }

    /*
     * @Description: 查询返回一个javaBean的sql语句
     * @Author:Shuker
     * @Date: 2020/11/4 23:07
     * @param sql: 要执行的sql语句
     * @param type:要返回javaBean的类型
     * @param args:占位符中的要填的数据
     * @return: T 返回的javabean对象
     **/
    public <T> T queryForOne(Class<T> type, String sql, Object... args) {
        Connection conn = JDBCUtils.getConnection();
        try {
            return queryRunner.query(conn, sql, new BeanHandler<T>(type), args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.closeRersource(conn);
        }
        return null;
    }

    /*
     * @Description:查询返回一个javaBean集合的sql语句
     * @Author:Shuker
     * @Date: 2020/11/4 23:12
     * @param type: 返回结果集的类型
     * @param sql: 执行的sql 语句
     * @param args:  占位符里面的值
     * @return: java.util.List<T> 一个javabean的结果list
     **/
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args) {
        Connection conn = JDBCUtils.getConnection();
        try {
            return queryRunner.query(conn, sql, new BeanListHandler<>(type), args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.closeRersource(conn);
        }
        return null;
    }

    /*
     * @Description: 查询一个返回一行一列的数据值
     * @Author:Shuker
     * @Date: 2020/11/4 23:15
     * @param sql: 执行的sql 语句
     * @param args: 占位符的值
     * @return: java.lang.Object 对应的返回值类型
     **/
    public Object queryForSingleValue(String sql, Object... args) {
        Connection conn = JDBCUtils.getConnection();
        try {
            return queryRunner.query(conn,sql,new ScalarHandler(),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
