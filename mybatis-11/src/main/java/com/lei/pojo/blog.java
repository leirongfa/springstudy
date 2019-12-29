package com.lei.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class blog {
    private  String id;
    private  String title;
    private  String  author;
    private Date  createTime;//属性名和数据库列名不一致在配置文件中设置config.xml中配置mapUnderscoreToCamelCase
    private  int views;
}
