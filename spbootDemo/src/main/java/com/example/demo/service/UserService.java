package com.example.demo.service;

import com.example.demo.bean.UserBean;

import java.util.List;


public interface UserService {

    UserBean loginIn(String name,String password);

    List<UserBean> getAll();
}
