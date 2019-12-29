package com.lei.demo01;
//租客类
public class Client {
    public static void main(String[] args) {
        //房东
        Host host = new Host();
       //代理
        Proxy proxy = new Proxy(host);
        //n你不用去看房东，直接去找中介
        proxy.rent();
    }
}
