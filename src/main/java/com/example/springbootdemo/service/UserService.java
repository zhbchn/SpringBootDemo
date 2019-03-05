package com.example.springbootdemo.service;

import com.example.springbootdemo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

//使用JdbcTemplate操作示例
@Service
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    //使用JdbcTemplate操作一般的SQL语句进行操作数据库
    public void createUser(String name,String password){
        System.out.println("createUser...");
        jdbcTemplate.update("INSERT INTO `users`(`username`, `password`) VALUES ('"+name+"','"+password+"' )");
        System.out.println("create User success!");
    }

    @Async   //异步注解
    public String sendSms(){
        System.out.println("###sendSms###3");
        for (int i = 0; i < 3; i++) {
            System.out.println("i="+i);
        }
        System.out.println("###sendSms###4");
        return "success";
    }
}
