package com.lei.dao;

import com.lei.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User getById(int id);
}
