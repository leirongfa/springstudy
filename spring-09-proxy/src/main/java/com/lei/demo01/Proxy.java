package com.lei.demo01;
//代理类
public class Proxy {
    private  Host host;

    public Proxy() {
    }
    public Proxy(Host host) {
        seeHouse();
        this.host = host;
       fare();
    }
    public void rent(){
        host.Rent();
    }
    public void seeHouse(){
        System.out.println("看房子");
    }
    public  void fare(){
        System.out.println("收租");
    }
}
