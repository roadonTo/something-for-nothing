package com.example.demo.mapper;

import com.example.demo.bean.UserBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    UserBean getInfo(String name,String password); //登录

    List<UserBean> getAll(); //查看所有用户
}
