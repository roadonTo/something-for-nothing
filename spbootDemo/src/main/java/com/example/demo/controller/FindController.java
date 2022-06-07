package com.example.demo.controller;

import com.example.demo.bean.UserBean;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public List<UserBean> find(){
        return userService.getAll();
    }
}
