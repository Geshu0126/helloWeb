package com.shuker.jdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @ClassName JDBCTemplateDemo
 * @Description TODO JDBCTemplate的基本用法
 * @Author Shuker
 * @Date 2020/12/8 21:51
 * @Version 1.0
 **/
public class JDBCTemplateDemo {
    public static void main(String[] args) {
        //准备数据源：spring内置数据源
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatis");
        dataSource.setUsername("root");
        dataSource.setPassword("333");

        // 1. 创建JDBCTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        jdbcTemplate.setDataSource(dataSource);
        //2.执行操作
        jdbcTemplate.execute("insert into account1(name,money)values('ccc',1000)");



    }

}
