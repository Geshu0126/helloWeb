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
 * @ClassName UserServlet
 * @Description TODO 处理用户的相关信息（注册、登录）
 * @Author Shuker
 * @Date 2020/11/8 15:26
 * @Version 1.0
 **/
public class UserServlet extends BaseServlet {
    private UserService userService = new UserServiceImpl();

    /**
     * @param req:
     * @param resp:
     * @Description:用户注册的功能
     * @Author:Shuker
     * @Date: 2020/11/8 15:34
     * @return: void
     **/
    public void regist(HttpServletRequest req, HttpServletResponse resp) {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");
        try {
            //校验验证码
            //后期服务器生成，目前先写死
            if ("abcde".equalsIgnoreCase(code)) {
                //正确的操作
                //检查用户名是否可用
                if (userService.existsUser(username)) {
                    //用户名存在，返回注册页面
                    System.out.println("用户名[" + username + "]已存在");
                    req.setAttribute("msg", "用户名已存在");
                    req.setAttribute("username", username);
                    req.setAttribute("email", email);
                    req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
                } else {
                    //没有就进行保存
                    userService.registUser(new User(null, username, password, email));
                    req.getRequestDispatcher("/pages/user/regist_success.jsp").forward(req, resp);
                }
            } else {
                //错误的操作。跳回注册页面
                System.out.println("验证码[" + code + "]错误");
                req.setAttribute("msg", "验证码输入错误");
                req.setAttribute("username", username);
                req.setAttribute("email", email);
                req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * @Description: 用户登录功能
     * @Author:Shuker
     * @Date: 2020/11/8 15:38
     * @param req:
     * @param resp:
     * @return: void
     **/
    public void login(HttpServletRequest req, HttpServletResponse resp) {
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
