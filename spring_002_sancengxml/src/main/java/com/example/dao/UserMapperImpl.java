package com.example.dao;

import com.example.pojo.Users;

/**
 * @author:洪文锴
 * @date:Created in 21:21 2022/6/5
 */
//数据访问层实现类
public class UserMapperImpl implements UserMapper {

    @Override
    public int insert(Users users) {
        System.out.println(users.getUname()+"用户增加成功");
        return 1;
    }
}
