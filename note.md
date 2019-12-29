##常用配置
```xml
 <dependencies>
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>5.2.0.RELEASE</version>
    </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
          <version>4.12</version>
        </dependency>
</dependencies>
```
##注解说明
@Autowired :自动装配,通过类型，名字
如果Autowired不能唯一的匹配上可使用@Qualifier(value = "dog2")来指定
@Resource ：自动装配,通过类型，名字
@Component：是组件，放在类上，说明这个类被spring所管理
@Component的衍生注解功能相同放的位置不通
第一个@Repository是用在了dao层
第二个@Service是使用在service层
第三个@Controller是用在control层
##开启自动注解装配
 xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd的约束
      2.  <context:annotation-config/>开启注解支持-->
 
 ##使用spring注解开发
 