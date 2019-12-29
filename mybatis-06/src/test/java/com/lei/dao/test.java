package com.lei.dao;

import com.lei.pojo.User;
import com.lei.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class test {
   static    Logger logger = Logger.getLogger(test.class);
    @Test
    public void getUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User byId = mapper.getById(1);
        System.out.println(byId);
    }
    @Test
    public  void testlog4j(){
         logger.info("info:进入testlog4j方法");
         logger.debug("debug进入testlog4j方法");
         logger.error("error进入testlog4j方法");
    }
    @Test
    public  void getUserLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> userLimit = mapper.getUserLimit(map);
        for (User u:userLimit
             ) {
            System.out.println(u);
        }
    }
}
