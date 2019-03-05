package com.example.springbootdemo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//全局捕获异常，切片
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    //Json，使用ResposeBoy，如果返回页面，就返回string类型，结果指定404页面即可。
    @ResponseBody
    public Map<String,Object> resultError(){
        Map<String,Object> resultMap= new HashMap<String,Object>();
        resultMap.put("errorCode",500);
        resultMap.put("errorMsg","系统错误!");
        return  resultMap;
    }
}
