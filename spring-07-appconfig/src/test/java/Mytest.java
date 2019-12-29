import com.lei.config.LeiConfig;
import com.lei.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        //如果完全用配置类的方法去做我们只能要AnnotationConfigApplicationContext的方式去生成
        ApplicationContext context = new AnnotationConfigApplicationContext(LeiConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user);
    }
}
