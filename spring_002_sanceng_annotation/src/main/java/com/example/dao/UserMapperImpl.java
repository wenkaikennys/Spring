package com.example.dao;

import com.example.pojo.Users;
import org.springframework.stereotype.Repository;

/**
 * @author:洪文锴
 * @date:Created in 21:21 2022/6/5
 */
//数据访问层实现类
//    交给spring管理的数据访问层实现对象
    @Repository
public class UserMapperImpl implements UserMapper {

    @Override
    public int insert(Users users) {
        System.out.println(users.getUname()+"用户增加成功");
        return 1;
    }
}
