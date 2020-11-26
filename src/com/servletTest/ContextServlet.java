package com.servletTest;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ContextServlet")
public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /*
     *功能描述
     * @author Shuker
     * @date 2020/11/3 21:19
     * @param  * @param null
     * @return
     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = this.getServletConfig().getServletContext();
        String username = servletContext.getInitParameter("username");
        String password = servletContext.getInitParameter("password");
        System.out.println("username"+username+" password: "+password);
        /*
        * / 被服务器解析成  http://ip:port/工程名/
        * */
        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);
        System.out.println("工程部署的路径："+servletContext.getRealPath("/"));
    }
}
