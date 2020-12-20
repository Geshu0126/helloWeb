package com.shuker.controller;

import com.shuker.domain.Account;
import com.shuker.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName AccountController
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/20 20:35
 * @Version 1.0
 **/
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;
    @RequestMapping(path = "/findAll")
    public String findAll(Model model){
        System.out.println("表现中的查找所有执行了");
        //调用service中的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);

        return "list";
    }


    @RequestMapping(path = "/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现中的保存所有执行了");
        //调用service中的方法
       accountService.saveAccount(account);
       response.sendRedirect(request.getContextPath()+"/account/findAll");
       return ;
    }

}
