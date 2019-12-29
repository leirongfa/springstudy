package com.lei.diy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class DiyPointCut {
    @Before("execution(* com.lei.service.UserServiceImpI.*(..))")
    void before(){
        System.out.println("=======执行方法前====");
    };
    void after(){
        System.out.println("=====执行方法后====");
    }
}
