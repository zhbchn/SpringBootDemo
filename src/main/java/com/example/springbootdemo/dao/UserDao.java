package com.example.springbootdemo.dao;

import com.example.springbootdemo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

//Jpa接口，包含了很多操作数据库的接口函数
public interface UserDao extends JpaRepository<Users, Integer> {
}
