package com.lei.demo02;

public class UserProxy implements UserService {
    private UserServiceImpI userServiceImpI;
    public UserProxy(UserServiceImpI userServiceImpI) {
     this.userServiceImpI = userServiceImpI;
     }

    @Override
    public void add() {
        log("add");
userServiceImpI.add();
    }

    @Override
    public void query() {
        log("query");
  userServiceImpI.query();
    }

    @Override
    public void delet() {
        log("delet");
userServiceImpI.delet();
    }

    @Override
    public void select() {
        log("select");
 userServiceImpI.select();
    }
    public  void log(String msg){
        System.out.println("使用"+msg+"方法");
    }
}
