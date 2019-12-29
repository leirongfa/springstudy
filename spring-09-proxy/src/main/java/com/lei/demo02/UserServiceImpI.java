package com.lei.demo02;

public class UserServiceImpI implements UserService {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void query() {
        System.out.println("query");
    }

    @Override
    public void delet() {
        System.out.println("delet");
    }

    @Override
    public void select() {
        System.out.println("select");
    }
}
