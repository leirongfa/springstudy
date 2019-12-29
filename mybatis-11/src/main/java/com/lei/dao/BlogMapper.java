package com.lei.dao;

import com.lei.pojo.blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    int addBook(blog blog);
    List<blog> queryBlogIf(Map map);
    List<blog> queryBlogChoose(Map map);
     int updateBlog(Map map);
     List<blog> queryBlog(Map map);
}
