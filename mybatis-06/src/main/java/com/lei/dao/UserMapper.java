package com.lei.dao;

import com.lei.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    User getById(int id);
    //分页
    List<User> getUserLimit(Map<String,Integer> map);
}
