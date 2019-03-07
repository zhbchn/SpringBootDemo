package com.example.springbootdemo.upload;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

//文件上传配置
@Configuration
public class FileUploadConfig {

    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory= new MultipartConfigFactory();
        factory.setMaxFileSize("2048KB");
        factory.setMaxRequestSize("2048KB");

        return null;
    }
}
