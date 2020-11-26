package com.bookStore.dao.impl;

import com.bookStore.dao.BaseDao;
import com.bookStore.dao.UserDao;
import com.bookStore.pojo.User;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/5 18:39
 * @Version 1.0
 **/
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryByUserName(String username) {
        String sql = "select `id`,`username`,`password`,`email` from t_user where `username` = ?";

        return queryForOne(User.class, sql, username);
    }

    @Override
    public User queryByUsernameAndPassword(String username, String password) {
        String sql = "select `id`,`username`,`password`,`email` from t_user where `username` =? and `password` = ?";
        return queryForOne(User.class, sql, username, password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into t_user(`username`,`password`,`email`) value(?,?,?)";

        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }
}
