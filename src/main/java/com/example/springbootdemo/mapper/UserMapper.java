package com.example.springbootdemo.mapper;

import com.example.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USERS WHERE username = #{username}")
    User findByName(@Param("username") String username);

    @Insert("INSERT INTO USERS(username, password) VALUES(#{username}, #{password})")
    int insert(@Param("username") String username, @Param("password") String password);
}