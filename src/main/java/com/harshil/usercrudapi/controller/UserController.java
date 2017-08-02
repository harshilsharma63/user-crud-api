package com.harshil.usercrudapi.controller;

import com.harshil.userdaoplugin.dao.UserDao;
import com.harshil.userdaoplugin.pojo.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping("/user/{id}")
    public AppUser getUser(@PathVariable int id) {
        return userDao.getUser(id);
    }
}
