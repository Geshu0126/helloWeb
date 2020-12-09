package com.shuker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebMethod;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/9 20:27
 * @Version 1.0
 **/
@Controller
public class HelloController {
    @RequestMapping(path="/hello")
    public String sayHello() {
        System.out.println("Hello SpringMVC");
        return "success";
    }
    @RequestMapping(path = "/saveAccount",method=RequestMethod.POST)
    public String saveAccount(String userName,double money){
        System.out.println("客户端username"+userName);
        System.out.println("money"+money);
        return "success";
    }
}
