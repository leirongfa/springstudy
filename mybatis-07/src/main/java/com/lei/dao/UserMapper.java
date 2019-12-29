package com.lei.dao;

import com.lei.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();
    //方法从存在多个参数，所有的参数都需要加@Param
    @Select("select * from user where id = #{id}")
    User getUser(@Param( "id")int id,@Param("name")String name);
   @Insert("insert into user (id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);
}
