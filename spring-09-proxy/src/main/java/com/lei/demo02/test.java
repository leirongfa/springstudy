package com.lei.demo02;

public class test {
    public static void main(String[] args) {
        UserServiceImpI impI = new UserServiceImpI();
        UserProxy userProxy = new UserProxy(impI);
        userProxy.add();
    }
}
