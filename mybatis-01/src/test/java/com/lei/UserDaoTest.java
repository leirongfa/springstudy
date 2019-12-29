package com.lei;

import com.lei.pojo.User;
import com.lei.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
@Test
    public void test(){
    //获取sqlSession对象
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    //执行sql
    //方式一
    UserDao mapper = sqlSession.getMapper(UserDao.class);
    List<User> userList = mapper.getUserList();
    for (User user:userList
         ) {
        System.out.println(user);
    }
    sqlSession.close();
    }
}

