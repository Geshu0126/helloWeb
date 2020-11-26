package com.javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @ClassName FormServlet
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/4 0:48
 * @Version 1.0
 **/
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("程序执行到servlet的doget方法里了");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(username + "的密码是" + password + ",爱好是" + Arrays.asList(hobbies));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求字符编码格式，解决post请求的中文乱码问题
        //这一行代码通常是位于方法体的第一行，这样可以避免先获取的英文参数参数比如： 密码，选择框中的值
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(username + "的密码是" + password + ",爱好是" + Arrays.asList(hobbies));
    }
}
