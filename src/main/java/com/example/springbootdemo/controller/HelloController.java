package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//纯接口测试，添加路径
@RequestMapping("/sys")
@RestController
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/getMap")
    public Map<String ,Object> getMap(){
        Map<String ,Object> result = new HashMap<String ,Object>();
        result.put("errorCode",200);
        result.put("errorMsg","success!");
        return  result;
    }
}
