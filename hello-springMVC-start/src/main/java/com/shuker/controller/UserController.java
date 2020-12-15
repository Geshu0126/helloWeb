package com.shuker.controller;

import com.shuker.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/15 19:16
 * @Version 1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    /*请求参数绑定*/
    @RequestMapping("/initUser")
    public String initUserInfo(Model model){
        //模拟从数据库中查找用户的信息
        User user = new User() ;
        user.setUsername("qingtian");
        user.setPassword("123");
        user.setAge(21);
        model.addAttribute("user", user);
        return "update";
    }

    @RequestMapping("/initAddRequest")
    public void initAddRequest(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        System.out.println("initAddRequest方法执行了");
        //请求转发
        request.getRequestDispatcher("../WEB-INF/pages/update.jsp").forward(request, response);

    }

    @RequestMapping("/initAddResponse")
    public void initAddResponse(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        System.out.println("initAddResponse方法执行了");
        System.out.println(request.getContextPath());
        //请求重定向
        response.sendRedirect(request.getContextPath()+"/response.jsp");

    }


    @RequestMapping("/initAddResponseWrite")
    public void initAddResponseWrite(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        System.out.println("initAddResponseWrite方法执行了");
        System.out.println(request.getContextPath());
        //请求重定向--直接响应数据
        //解决中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("你好");

    }

    @RequestMapping("/modelAndView")
    public ModelAndView findAll(){
        System.out.println("modelAndView方法执行了");
        ModelAndView modelAndView = new ModelAndView();
        //设置要跳转的页面
        //配置了视图解析器，
        modelAndView.setViewName("userList");
        //模拟从数据库中查找所有的用户
        List<User> users = new ArrayList<>();
        User user1 = new User("qingtian1", "1234", 21);
        User user2 = new User("qingtian2", "12345", 22);
        users.add(user1);
        users.add(user2);
        modelAndView.addObject("users",users);
        return modelAndView;
    }
    /*forward:转发的JSP路径"，不走视图解析器了，所以需要编写完整的路径*/
    @RequestMapping("/delete")
    public String delete(){
        System.out.println("delete方法执行了");
        return "forword:/user/initUser";
    }

    /*重定向*/
    @RequestMapping("/count")
    public String count(){
        System.out.println("count方法执行了");
        return "redirect:/user/initUser";
    }
}
