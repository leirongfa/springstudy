package com.lei.pojo;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
        System.out.println(name);
        System.out.println("有参数给构造");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private void show (){
        System.out.println(this.name+"///"+"111s");
    }
}
