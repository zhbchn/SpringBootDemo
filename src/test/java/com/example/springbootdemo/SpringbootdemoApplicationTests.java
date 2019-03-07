package com.example.springbootdemo;

import com.example.springbootdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//单元测试
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootdemoApplication.class) //添加对应的启动Application
public class SpringbootdemoApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    public void testCreateUser() {

        userService.createUser("zhaobao","111111");
        System.out.println("insert user success");
    }

}
