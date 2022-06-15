package com.example.service.impl;

import com.example.dao.UserMapper;
import com.example.dao.UserMapperImpl;
import com.example.pojo.Users;
import com.example.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:洪文锴
 * @date:Created in 21:25 2022/6/5
 */
//业务逻辑层实现对象
    @Service
public class UserServiceImpl implements UsersService {

    //需要访问数据访问层，创建一个数据访问层的对象
    @Autowired
    private UserMapper userMapper;//= (UserMapper) new UserMapperImpl();


    /*public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }*/

    @Override
    public int insert(Users users) {
        return userMapper.insert(users);
    }
}
