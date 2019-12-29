package com.lei.dao;

import com.lei.pojo.User;
import com.lei.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class test {
    @Test
    public  void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User u: userList
             ) {
            System.out.println(u);
        }
    }
    @Test
    public  void getById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User byId = mapper.getById(1);
        System.out.println(byId);
    }
    @Test
    public  void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
       mapper.addUser(new User(6,"雷荣发6","123456"));
       //提交事务否则无法写进数据库
       sqlSession.commit();
       sqlSession.close();
    }
    @Test
    public  void addMapUser(){
        //使用map
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userid",5);
        map.put("username","了伟大的");
        map.put("userpwd","456123");
        mapper.addUser2(map);
        //提交事务否则无法写进数据库
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public  void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
       mapper.UpdateUser(new User(6,"黄河大王","1111111"));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public  void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(6);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public  void getUserlike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userLike = mapper.getUserLike("%雷%");
        for (User u:
             userLike) {
            System.out.println(u);
        }
        sqlSession.close();
    }
}
