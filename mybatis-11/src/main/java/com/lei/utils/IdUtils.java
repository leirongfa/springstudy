package com.lei.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.UUID;

public class IdUtils {
   public  static  String getId(){
       //生成随机且唯一的字符串
       return UUID.randomUUID().toString().replaceAll("-","");
   }
   @Test
    public  void test(){
       System.out.println(IdUtils.getId());
   }
}