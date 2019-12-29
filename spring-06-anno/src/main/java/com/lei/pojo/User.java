package com.lei.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//等价于 <bean id="user" class="com.lei.pojo.User"></bean>
//@Component 组件
@Component
public class User {
    //相当于  <property name="name"value="雷荣发"></property>
    @Value("雷荣发")
    public   String name ;
}
