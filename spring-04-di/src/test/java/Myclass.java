import com.lei.pojo.Student;
import com.lei.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myclass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student)context.getBean("student");
        String name = student.getName();
        System.out.println(student.toString());
    }
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = (User) context.getBean("user",User.class);
        System.out.println(user.toString());
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = (User) context.getBean("user2",User.class);
        User user2 = (User) context.getBean("user2",User.class);
        System.out.println(user==user2);
        System.out.println(user.toString());
    }
}
