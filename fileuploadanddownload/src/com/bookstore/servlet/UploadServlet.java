package com.bookstore.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName UploadServlet
 * @Description TODO
 * @Author Shuker
 * @Date 2020/11/7 16:42
 * @Version 1.0
 **/
public class UploadServlet extends HttpServlet {
    /**
     * @param req:
     * @param resp:
     * @Description: 用来处理长传的数据
     * @Author:Shuker
     * @Date: 2020/11/7 16:43
     * @return: void
     **/
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //判断上传的数据是够是多段数据（只有多段的数据，才是文件上传的）
        if (ServletFileUpload.isMultipartContent(req)) {
            //创建FIleItemFactory工厂实现类
            FileItemFactory fileItemFactory = new DiskFileItemFactory();
            //创建用于解析上传数据的工具类ServletFileUpload类
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
            try {
                //解析上传数据，得到每一个表单的FileItem
                List<FileItem> list = servletFileUpload.parseRequest(req);
                //循环遍历，每一个表单项，是普通类型，还是上传的文件
                for (FileItem fileitem : list) {
                    if(fileitem.isFormField()){
                        //普通表单项
                        System.out.println("表单项的name属性值"+fileitem.getFieldName());
                        //参数utf-8解决乱码的问题
                        System.out.println("表单项的value的值"+ fileitem.getString("utf-8"));
                    }else{
                        //上传的文件
                        System.out.println("表单项的name属性值"+fileitem.getFieldName());
                        System.out.println("上传的文件名"+fileitem.getName());
                        fileitem.write(new File("e:\\"+fileitem.getName()));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
