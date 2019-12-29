package com.lei.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//使用注解实现aop
@Aspect //标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.lei.service.UserServiceImpI.*(..))")
    void before(){
        System.out.println("===方法开始之前===");
    }
    @After("execution(* com.lei.service.UserServiceImpI.*(..))")
    void  after(){
        System.out.println("===方法开始之后===");
    }
    @Around("execution(* com.lei.service.UserServiceImpI.*(..))")
  void Around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Object proceed = jp.proceed();//执行方法
        System.out.println("环绕后");
    }
}
