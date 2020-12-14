package com.shuker.controller;

import com.shuker.domain.Account;
import com.shuker.domain.FormatTest;
import com.shuker.domain.Producer;
import com.shuker.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/14 19:09
 * @Version 1.0
 **/
/*交给spring容器管理*/
@Controller
/*写在类上 代表访问一级目录*/
@RequestMapping(path = "/user")
public class HelloController {

    /*接收请求*/
    /*写在方法上 代表访问二级目录*/
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello springmvc");
        return "success";
    }

    /**
     * @Description:对于一般类型的数据进行绑定
     * @Author:Shuker
     * @Date: 2020/12/14 19:33
     * @param username:
     * @param password:
     * @return: java.lang.String
     **/
    @RequestMapping("/helloParam")
    public String helloParam(String username ,String password,Integer age) {
        System.out.println("helloparam方法执行了");
        System.out.println(username);
        System.out.println(password);
        System.out.println(age);
        return "success";
    }


    @RequestMapping("/helloDomainParam1")
    public String helloDomainParam1(User user){
        System.out.println("helloDomainParam执行了");
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getAge());
     return "success" ;
    }
    @RequestMapping("/helloDomainParam2")
    public String helloDomainParam2(Account account){
        System.out.println("helloDomainParam执行了");
        System.out.println(account.getAccountId());
        System.out.println(account.getMoney());
        System.out.println(account.getUser().getUsername());
        System.out.println(account.getUser().getPassword());
        System.out.println(account.getUser().getAge());
        return "success" ;
    }

    /**
     * @Description:类型中含有集合 list map 元素的
     * @Author:Shuker
     * @Date: 2020/12/14 20:13
     * @param account:
     * @return: java.lang.String
     **/
    @RequestMapping("/helloDomainParam3")
    public String helloDomainParam3(Producer account){
        System.out.println("helloDomainParam3执行了");
        System.out.println(account);
        return "success" ;
    }



    /**
     * @Description:类型中含有集合 list map 元素的
     * @Author:Shuker
     * @Date: 2020/12/14 20:13
     * @return: java.lang.String
     **/
    @RequestMapping("/helloDomainParam4")
    public String helloDomainParam4(FormatTest dateTime){
        System.out.println("helloDomainParam4执行了");
        System.out.println(dateTime.getDateTime());
        return "success" ;
    }
    /**
     * @Description:对原生servlet的支持
     * @Author:Shuker
     * @Date: 2020/12/14 20:13
     * @return: java.lang.String
     **/
    @RequestMapping("/supportRequest")
    public String supportRequest(HttpServletRequest request){
        System.out.println("supportRequest执行了");
        String username = request.getParameter("username");
        System.out.println(username);
        String password = request.getParameter("password");
        System.out.println(password);
        System.out.println(request.getParameter("age"));
        return "success" ;
    }


}
