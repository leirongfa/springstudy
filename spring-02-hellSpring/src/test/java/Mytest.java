import com.lei.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //对象都在spring中进行管理了我们只需要用那个调那个
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
