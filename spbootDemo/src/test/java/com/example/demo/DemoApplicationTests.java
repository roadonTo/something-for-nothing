package com.example.demo;

import com.example.demo.bean.UserBean;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        UserBean userBean=userService.loginIn("a","a");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}
