package com.bookStore.web;

import com.bookStore.pojo.User;
import com.bookStore.service.UserService;
import com.bookStore.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName LoginServlet
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/5 22:08
 * @Version 1.0
 **/
public class LoginServlet extends BaseServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User login = userService.login(new User(null, username, password, null));
        if(login !=null){
            req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req,resp);
        }else{
            req.setAttribute("msg","用户或密码错误");
            req.setAttribute("username",username);
            System.out.println(username+"登录失败");
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req,resp);
        }
    }
}
