package com.lei.dao;

import com.lei.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //根据id查询
    User queryUserById(@Param("id") int id);
}
