package com.shuker.controller;

import com.shuker.domain.Items;
import com.shuker.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName ItemsController
 * @Description TODO
 * @Author Shuker
 * @Date 2021/1/1 15:53
 * @Version 1.0
 **/
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService ;

    @RequestMapping("/findDetail")
    public String findDetail(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item", items);
        return "itemDetail";
    }
}
