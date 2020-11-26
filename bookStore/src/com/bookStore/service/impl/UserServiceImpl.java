package com.bookStore.service.impl;

import com.bookStore.dao.UserDao;
import com.bookStore.dao.impl.UserDaoImpl;
import com.bookStore.pojo.User;
import com.bookStore.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/5 19:14
 * @Version 1.0
 **/
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {

        return userDao.queryByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existsUser(String username) {
        User user = userDao.queryByUserName(username);
        if(user == null){
            return false ;
        }
        return true;
    }
}
