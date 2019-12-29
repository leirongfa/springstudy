package com.lei.config;

import com.lei.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//这个也会被spring容器所接管，注册到容器中,本质也是@Component，
//@Configuration代表了就是一个配置类，和我们之前的bean.xml功能相同
@ComponentScan("com.lei.pojo")//让他去扫描pojo包的注解
public class LeiConfig {
    @Bean//相当于我们之前的写的一个bean标签，id等于方法名 ，class相当于这个方法的返回值
    public User getUser(){
        return new User();
    }
}
