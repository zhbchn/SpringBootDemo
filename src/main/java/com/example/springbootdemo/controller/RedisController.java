package com.example.springbootdemo.controller;

import com.example.springbootdemo.RedisService.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Redis使用示例
@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/setRedisValue")
    public String setValue(String key,String value){
        redisService.setStringValue(key,value);
        return "success";
    }


    @RequestMapping("/getRedisValue")
    public String getValue(String key){
        return redisService.getStringValue(key);
    }
}
