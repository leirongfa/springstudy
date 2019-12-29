import com.lei.aop.UserService;
import com.lei.aop.UserServiceImpI;
import com.lei.leixin.Student;
import com.lei.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = context.getBean("service", UserService.class);
        service.add();
    }
}
