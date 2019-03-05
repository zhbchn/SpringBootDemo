package com.example.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

//整合MyBatis示例，要加上的，不使用这个，在Mapper里加上@Mapper注解即可
//@MapperScan(basePackages = {"com.example.springbootdemo.mapper"})
//@EnableScheduling  //开启任务调度
@EnableAsync  //开启异步方法
@EnableCaching  //开启缓存，使用Redis
@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

}
