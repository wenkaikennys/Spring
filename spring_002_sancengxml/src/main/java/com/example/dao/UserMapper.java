package com.example.dao;

import com.example.pojo.Users;

/**
 * @author:洪文锴
 * @date:Created in 21:20 2022/6/5
 */
//数据访问层接口
public interface UserMapper {
    int insert(Users users);
}
