package com.shuker.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/16 21:03
 * @Version 1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * @Description:springmvc实现文件上传
     * @Author:Shuker
     * @Date: 2020/12/17 0:18
     * @param request:
     * @param multipartFile:
     * @return: java.lang.String
     **/
    @RequestMapping("/fileUpload2")
    public String fileUpload2(HttpServletRequest request, MultipartFile upload) throws IOException {
        //往哪里传-->上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        //判断，如果不存在就创建
        File file = new File(path);
        if (!file.exists()){
            //不存在就创建
            file.mkdirs();
        }
        //获取上传文件的名称
        String fileName = upload.getOriginalFilename();
        //唯一化文件名
        String uuid = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        fileName = uuid+"_"+fileName;
        //上传文件
        upload.transferTo(new File(file,fileName));
        return "success";
    }
    /**
     * @Description:传统文件上传的实现，用fileupload组件
     * @Author:Shuker
     * @Date: 2020/12/17 0:18
     * @param request:
     * @return: java.lang.String
     **/
    @RequestMapping("/fileUpload1")
    public String fileUpload1(HttpServletRequest request) throws Exception {
        System.out.println("传统文件上传。。。");
        //使用fileupload组件完成文件上传
        //上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        //判断，该路径是否存在
        File file = new File(path);
        if (!file.exists()){
            //不存在就创建文件夹
            file.mkdirs();
        }
        //解析request对象，获取上传文件
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        //解析request对象
        List<FileItem> list = upload.parseRequest(request);
        //遍历
        for (FileItem fileItem:list){
            //判断文件项是普通字段还是上传的文件
            if(fileItem.isFormField()){

            }else{
                //这里就是文件项
                //获取上传文件的名称
                String fileName = fileItem.getName();
                //上传文件
                fileItem.write(new File(file,fileName));
                //删除临时文件
                fileItem.delete();
            }
        }
        return "success";
    }
}
