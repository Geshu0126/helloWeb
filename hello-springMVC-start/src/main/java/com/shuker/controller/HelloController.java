package com.shuker.controller;

import com.shuker.domain.Account;
import com.shuker.domain.FormatTest;
import com.shuker.domain.Producer;
import com.shuker.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

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
    public String sayHello() {
        System.out.println("hello springmvc");
        return "success";
    }

    /**
     * @param username:
     * @param password:
     * @Description:对于一般类型的数据进行绑定
     * @Author:Shuker
     * @Date: 2020/12/14 19:33
     * @return: java.lang.String
     **/
    @RequestMapping("/helloParam")
    public String helloParam(String username, String password, Integer age) {
        System.out.println("helloparam方法执行了");
        System.out.println(username);
        System.out.println(password);
        System.out.println(age);
        return "success";
    }


    @RequestMapping("/helloDomainParam1")
    public String helloDomainParam1(User user) {
        System.out.println("helloDomainParam执行了");
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getAge());
        return "success";
    }

    @RequestMapping("/helloDomainParam2")
    public String helloDomainParam2(Account account) {
        System.out.println("helloDomainParam执行了");
        System.out.println(account.getAccountId());
        System.out.println(account.getMoney());
        System.out.println(account.getUser().getUsername());
        System.out.println(account.getUser().getPassword());
        System.out.println(account.getUser().getAge());
        return "success";
    }

    /**
     * @param account:
     * @Description:类型中含有集合 list map 元素的
     * @Author:Shuker
     * @Date: 2020/12/14 20:13
     * @return: java.lang.String
     **/
    @RequestMapping("/helloDomainParam3")
    public String helloDomainParam3(Producer account) {
        System.out.println("helloDomainParam3执行了");
        System.out.println(account);
        return "success";
    }


    /**
     * @Description:类型中含有集合 list map 元素的
     * @Author:Shuker
     * @Date: 2020/12/14 20:13
     * @return: java.lang.String
     **/
    @RequestMapping("/helloDomainParam4")
    public String helloDomainParam4(FormatTest dateTime) {
        System.out.println("helloDomainParam4执行了");
        System.out.println(dateTime.getDateTime());
        return "success";
    }

    /**
     * @Description:对原生servlet的支持
     * @Author:Shuker
     * @Date: 2020/12/14 20:13
     * @return: java.lang.String
     **/
    @RequestMapping("/supportRequest")
    public String supportRequest(HttpServletRequest request) {
        System.out.println("supportRequest执行了");
        String username = request.getParameter("username");
        System.out.println(username);
        String password = request.getParameter("password");
        System.out.println(password);
        System.out.println(request.getParameter("age"));
        return "success";
    }

    @RequestMapping("/requestParamTest")
    public String requestParamTest(@RequestParam(value = "username", required = false) String name, @RequestParam("password") String pwd, Integer age) {
        System.out.println("requestParamTest执行了");
        System.out.println(name);
        System.out.println(pwd);
        System.out.println(age);

        return "success";
    }

    /**
     * @param body:
     * @Description:requestBody 注解
     * 只适用于post请求
     * @Author:Shuker
     * @Date: 2020/12/14 23:49
     * @return: java.lang.String
     **/
    @RequestMapping("/requestBodyTest")
    public String requestBodyTest(@RequestBody String body) {
        System.out.println("requestBodyTest执行了");
        System.out.println(body);

        return "success";
    }

    @RequestMapping("/pathVariableTest/{userId}")
    public String pathVariableTest(@PathVariable(value = "userId") String id, User user) {
        System.out.println("requestBodyTest执行了");
        System.out.println(id);
        System.out.println(user);
        return "success";
    }

    /**
     * @Description:修改用户的方法
     * @Author:Shuker
     * @Date: 2020/12/15 0:04
     * @param user:
     * @return: java.lang.String
     **/
    @RequestMapping("/updateUser")
    public String updateUser(User user) {
        System.out.println("updateUser执行了");
        System.out.println(user);
        return "success";
    }
    /**
     * @Description:修改用户的方法
     * @Author:Shuker
     * @Date: 2020/12/15 0:04
     * @param user:
     * @return: java.lang.String
     **/
    @RequestMapping("/updateUser1")
    public String updateUser1(@ModelAttribute(value = "user1") User user) {
        System.out.println("updateUser1执行了");
        System.out.println(user);
        return "success";
    }
    /**
     * @Description:modelAttribute测试 有返回值情况①
     * @Author:Shuker
     * @Date: 2020/12/15 0:01

     * @return: com.shuker.domain.User
     **/
    @ModelAttribute
    public User showUser(String username) {
        System.out.println("showUser执行了");
        //模拟从数据库中查找数据
        User user = new User() ;
        user.setUsername("哈哈");
        user.setAge(10);
        user.setPassword("qingtian123");

        return user;
    }

    /**
     * @Description:modelAttribute测试 没有返回值情况②
     * @Author:Shuker
     * @Date: 2020/12/15 0:01

     * @return: com.shuker.domain.User
     **/
    @ModelAttribute
    public void showUser(String username, Map<String,User> map) {
        System.out.println("showUser执行了");
        //模拟从数据库中查找数据
        User user = new User() ;
        user.setUsername("哈哈");
        user.setAge(10);
        user.setPassword("qingtian123");
        map.put("user1", user);
    }
}
