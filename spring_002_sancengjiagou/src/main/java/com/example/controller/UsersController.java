package com.example.controller;

import com.example.pojo.Users;
import com.example.service.UsersService;
import com.example.service.impl.UserServiceImpl;

/**
 * @author:洪文锴
 * @date:Created in 21:29 2022/6/5
 */
//界面层
public class UsersController {

    //如何访问页面逻辑层 Service层
    public UsersService userMapper = new UserServiceImpl();
    //界面层的功能实现
    public int insert(Users users) {
        //业务层的功能实现
        return userMapper.insert(users);
    }
}
