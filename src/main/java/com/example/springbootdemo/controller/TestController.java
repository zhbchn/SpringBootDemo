package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//纯接口示例
@RequestMapping("/test")
@Controller
public class TestController {

    @RequestMapping("/index")
    public String index(Map<String ,Object> result){
        System.out.printf("Index .....");
        result.put("name","helloTemplates");
        result.put("sex",1);
        List<String> list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("李四");
        result.put("list",list);
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
