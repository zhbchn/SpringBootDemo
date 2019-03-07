package com.example.springbootdemo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//全局捕获异常，切片
@ControllerAdvice
public class GlobalExceptionHandler {

    //使用org.slf4j.Logger,这是Spring实现日志的方法
    private final static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(RuntimeException.class)
    //Json，使用ResposeBoy，如果返回页面，就返回string类型，结果指定404页面即可。
    @ResponseBody
    public Map<String,Object> resultError(Throwable ex){
        Map<String,Object> resultMap= new HashMap<String,Object>();
        resultMap.put("errorCode",500);
        resultMap.put("errorMsg","系统错误!"+ex.toString());

        //打印错误日志，也可以保存到数据
        logger.warn("#############################Error Log Start############");
        logger.warn(ex.toString());
        logger.warn(ex.getMessage());
        logger.warn(ex.getLocalizedMessage());
        logger.warn("#############################Error Log End############");
        return  resultMap;
    }
}
