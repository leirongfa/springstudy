package com.lei.dao;

import com.lei.pojo.Student;
import com.lei.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface teacherMapper {
    @Select("select * from teacher where id =#{tid}")
      Teacher getTeacher(@Param("tid") int id);

}
