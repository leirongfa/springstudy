import com.lei.dao.BlogMapper;
import com.lei.pojo.blog;
import com.lei.utils.IdUtils;
import com.lei.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class test {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        blog blog = new blog();
        blog.setId(IdUtils.getId());
        blog.setAuthor("雷荣2");
        blog.setTitle("ccc");
        blog.setViews(65456);
        blog.setCreateTime(new Date());
        int i = mapper.addBook(blog);
        sqlSession.close();
    }
    @Test
    public  void queryBlogIfTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","雷荣2");
        List<blog> blogs = mapper.queryBlogIf(map);
        System.out.println(blogs);
    }
    @Test
    public  void queryBlogChooseTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","16126");
        map.put("views","65456");
        List<blog> blogs = mapper.queryBlogChoose(map);
        for (blog blog : blogs) {
            System.out.println(blog);
        }
    }
    @Test
    public  void queryBlogUpadateTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","16126");
        map.put("author","lei123");
        map.put("id","6d64a15deba949588ebda45a455ad12e");
        int i = mapper.updateBlog(map);
        System.out.println(i);
    }
    @Test
    public  void quertblogForEachTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        map.put("ids",ids);
        List<blog> blogs = mapper.queryBlog(map);
        for (blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
