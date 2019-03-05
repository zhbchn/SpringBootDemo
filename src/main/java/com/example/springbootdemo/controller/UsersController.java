package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//整合MyBatis示例
@RestController
public class UsersController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/findByName")
    public User findByName(String username){
        return userMapper.findByName(username);
    }

    @RequestMapping("/insert")
    public int insert(String username, String password){
        userMapper.insert(username,password);
        return 1;
    }
}
