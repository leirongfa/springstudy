package com.lei.service;

import com.lei.dao.UserDao;
import com.lei.dao.UserDaoImp;

public class UserServiceImp implements UserService {
    private UserDao userDao = new UserDaoImp();
    public void getUser() {
         userDao.getUser();
    }
}
