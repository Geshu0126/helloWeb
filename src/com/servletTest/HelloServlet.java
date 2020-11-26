package com.servletTest;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @ClassName HelloServlet
 * @Description TODO servlet的执行顺序  构造器--->初始化 init---->service----->destroy
 * @Author Shuker
 * @Date 2020/11/3 11:03
 * @Version 1.0
 **/
public class HelloServlet implements Servlet {

    public HelloServlet() {
        System.out.println("无参的构造器执行了");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init初始化方法执行了");
        String username = servletConfig.getInitParameter("username");
        String url = servletConfig.getInitParameter("url");
        System.out.println(username);
        System.out.println(url);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet中的方法执行了！！！");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        System.out.println(method);
        if ("POST".equals(method)) {
            this.doGet();
        } else if ("GET".equals(method)) {
            this.doPost();
        } else {
            System.out.println("出现bug l");
        }

    }

    public void doGet() {
        System.out.println("get方法在这里执行了");
    }

    public void doPost() {
        System.out.println("post方法在这里执行了");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy方法执行了");
    }
}
