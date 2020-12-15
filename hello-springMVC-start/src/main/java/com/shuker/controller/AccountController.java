package com.shuker.controller;

import com.shuker.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * @ClassName AccountController
 * @Description TODO
 * @Author Shuker
 * @Date 2020/12/15 0:15
 * @Version 1.0
 **/
@Controller
@RequestMapping(path = "/account")
//把数据存在session域中
@SessionAttributes(value = {"accountId","money","user"},types = {Integer.class,Double.class,User.class})
public class AccountController {
    @RequestMapping("/find")
    public String find(ModelMap modelMap){
        Integer id = (Integer) modelMap.get("accountId");
        Double money = (Double) modelMap.get("money");
       User user = (User) modelMap.get("user");
        System.out.println(id +":"+money+":"+user.toString());
        return "success";
    }
    /**
     * @Description:往session中存值
     * @Author:Shuker
     * @Date: 2020/12/15 0:23
     * @param model:
     * @return: java.lang.String
     **/
    @RequestMapping("/save")
    public String save(Model model){
        System.out.println("向session域中保存数据");
        model.addAttribute("accountId",12);
        model.addAttribute("money",2131312.0);
        model.addAttribute("user", new User("qingtian", "haha", 12));
        return "success";
    }

    /**
     * @Description:往session中存值
     * @Author:Shuker
     * @Date: 2020/12/15 0:23
     * @param status:
     * @return: java.lang.String
     **/
    @RequestMapping("/delete")
    public String delete(SessionStatus status){
        System.out.println("delete");
        status.setComplete();
        return "success";
    }
}
