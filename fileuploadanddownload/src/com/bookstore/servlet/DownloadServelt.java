package com.bookstore.servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

/**
 * @ClassName DownloadServelt
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/7 17:09
 * @Version 1.0
 **/
public class DownloadServelt extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取下载的文件名
        String downloadFeileName = "背景.jpg" ;
        //2.读取要下载文件内容（通过ServletContext对象可以获取）
        ServletContext servletContext = getServletContext();
        //3.获取需要下载的文件类型
        String minmeType = servletContext.getMimeType("/image/"+downloadFeileName);
        System.out.println("下载文件的类型"+ minmeType);
        //4.回传之前，通过响应头告诉客户端范湖的数据类型
        resp.setContentType(minmeType);
        resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(downloadFeileName,"utf-8"));

        InputStream resourceAsStream = servletContext.getResourceAsStream("/image/" + downloadFeileName);
        OutputStream outputStream = resp.getOutputStream();
        IOUtils.copy(resourceAsStream,outputStream);


    }
}
