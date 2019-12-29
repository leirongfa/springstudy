package com.lei.dao;

import com.lei.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
     List<User> getUserList();
     User getById(int id);
     int addUser (User user);
     int addUser2 (Map<String,Object> map);
     int UpdateUser(User user);
     int deleteUser(int id);
     //模糊查询
     List<User>getUserLike(String value);
}
