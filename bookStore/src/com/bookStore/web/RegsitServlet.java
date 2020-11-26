package com.bookStore.web;

import com.bookStore.pojo.User;
import com.bookStore.service.UserService;
import com.bookStore.service.impl.UserServiceImpl;
//import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName RegsitServlet
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/5 20:24
 * @Version 1.0
 **/
public class RegsitServlet extends BaseServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");

        User user = new User();

        /*try {
            System.out.println("注入之前的user:"+user);
        //    BeanUtils.populate(user,req.getParameterMap());
            System.out.println("注入之后的user:"+user);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }*/

        //校验验证码
        //后期服务器生成，目前先写死
        if ("abcde".equalsIgnoreCase(code)) {
            //正确的操作
            //检查用户名是否可用
            if (userService.existsUser(username)) {
                //用户名存在，返回注册页面
                System.out.println("用户名[" + username + "]已存在");
                req.setAttribute("msg","用户名已存在");
                req.setAttribute("username",username);
                req.setAttribute("email",email);
                req.getRequestDispatcher("/pages/user/regist.jsp").forward(req,resp);
            }else{
                //没有就进行保存
                userService.registUser(new User(null,username,password,email));
                req.getRequestDispatcher("/pages/user/regist_success.jsp").forward(req,resp );
            }
        } else {
            //错误的操作。跳回注册页面
            System.out.println("验证码[" + code + "]错误");
            req.setAttribute("msg","验证码输入错误");
            req.setAttribute("username",username);
            req.setAttribute("email",email);
            req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
        }
    }
}
