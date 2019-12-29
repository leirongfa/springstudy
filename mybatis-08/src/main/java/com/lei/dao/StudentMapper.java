package com.lei.dao;

import com.lei.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询学生的所有信息以及老师所对应的信息
     List<Student> getStudent();
}
