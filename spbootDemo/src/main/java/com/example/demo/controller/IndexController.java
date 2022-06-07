package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * 这个没连数据库的测试页
 */

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String hello(Model model){
        model.addAttribute("msg","hello springBoot");

        model.addAttribute("users", Arrays.asList("gongTeng","xiaoLan"));

        return "test";
    }


}
