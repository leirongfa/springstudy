import com.lei.dao.StudentMapper;
import com.lei.dao.teacherMapper;
import com.lei.pojo.Student;
import com.lei.pojo.Teacher;
import com.lei.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        teacherMapper mapper = sqlSession.getMapper(teacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
    }
    @Test
    public  void testStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student s : student) {
            System.out.println(s);
        }


    };
}
