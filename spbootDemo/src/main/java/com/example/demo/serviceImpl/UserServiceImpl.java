package com.example.demo.serviceImpl;

import com.example.demo.bean.UserBean;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {
    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }

    @Override
    public List<UserBean> getAll() {
        return userMapper.getAll();
    }
}
