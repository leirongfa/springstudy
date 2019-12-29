import com.lei.pojo.person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        person person = context.getBean("person", com.lei.pojo.person.class);
        person.getCat().shout();
        person.getDog().shout();

    }
}
