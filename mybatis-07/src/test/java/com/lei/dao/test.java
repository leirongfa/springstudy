package com.lei.dao;

import com.lei.pojo.User;
import com.lei.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public  void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User u:users) { System.out.println(u); }
        User user = mapper.getUser(1, "雷荣发");
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public  void testadd(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.addUser(new User(7, "4646", "4656"));
        sqlSession.close();
    }
}
