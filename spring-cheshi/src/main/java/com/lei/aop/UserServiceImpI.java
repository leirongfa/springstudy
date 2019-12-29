package com.lei.aop;

public class UserServiceImpI implements UserService {

    public void add() {
        System.out.println("add");
    }

    public void update() {
        System.out.println("update");
    }

    public void delete() {
        System.out.println("delete");
    }

    public void select() {
        System.out.println("select");
    }
}
