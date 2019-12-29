package com.lei.service;

public class UserServiceImpI implements  UserService {
    @Override
    public void add() {
        System.out.println("add");
    }
    @Override
    public void update() {
        System.out.println("update");
    }
    @Override
    public void delete() {
        System.out.println("delete");
    }
    @Override
    public void select() {
        System.out.println("select");
    }
}
