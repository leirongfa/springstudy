package com.lei.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//自动生成动态代理
public class ProxyinvocationHandler implements InvocationHandler {
  //被代理的接口
    private  Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }
//生成得到代理类
    public Object getProxy(){
        Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
        return o;
    }

  //处理代理的实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质是使用反射
        Object result = method.invoke(rent, args);
        return result;
    }
}
