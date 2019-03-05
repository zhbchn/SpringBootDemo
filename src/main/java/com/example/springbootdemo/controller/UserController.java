package com.example.springbootdemo.controller;

import com.example.springbootdemo.dao.UserDao;
import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.entity.Users;
import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    //通用的SQL语句示例，JdbcTemplate
    @Autowired
    private UserService userService;

    //JPA的使用示例
    @Autowired
    private UserDao userDao;

    //读取配置文件里的参数
    @Value("${name}")
    private String name;


    //通用的SQL语句示例
    @RequestMapping("/addUser")
    public  String createUser(String name,String password){
        userService.createUser(name,password);
        return "success";
    }

    //JPA的使用示例
    @RequestMapping("getUsers")
    public Users getUsers(Integer uid){
        Optional<Users> user=userDao.findById(uid);
        return user.get();
    }

    //异步方法测试，和UserService联合使用
    @RequestMapping("/sendMsg")
    public String sendMsg(){
        System.out.println("###sendMsg###1");
        userService.sendSms();  //异步方法，不会等待这个方法执行完才去执行后面的语句
        System.out.println("###sendMsg###2");

        return "success";
    }

    //读取配置文件里的参数示例
    @RequestMapping("/getValue")
    public String getConfigValue(){

        return name;
    }
}
