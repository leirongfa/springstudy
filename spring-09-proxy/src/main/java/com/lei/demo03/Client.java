package com.lei.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理对象
        ProxyinvocationHandler handler = new ProxyinvocationHandler();
        //调用代理类实现被代理类的方法
        handler.setRent(host);
        Rent proxy = (Rent) handler.getProxy();
        proxy.Rent();
    }
}
