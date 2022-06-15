package com.example.controller;

import com.example.pojo.Users;
import com.example.service.UsersService;
import com.example.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author:洪文锴
 * @date:Created in 21:29 2022/6/5
 */
//界面层
    @Controller
public class UsersController {

    //如何访问页面逻辑层 Service层
    @Autowired
    public UsersService usersService;// = new UserServiceImpl();

/*
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }
*/

    //界面层的功能实现
    public int insert(Users users) {
        //业务层的功能实现
        return usersService.insert(users);
    }
}
