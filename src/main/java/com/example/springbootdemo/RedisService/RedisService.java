package com.example.springbootdemo.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    private RedisUtil redisUtil;

    public void setStringValue(String key,String value){
        redisUtil.set(key,value);
    }

    public String getStringValue(String key){
        return redisUtil.get(key).toString();
    }
}
