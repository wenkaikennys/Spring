package com.example.test;

import com.example.controller.UsersController;
import com.example.pojo.Users;
import org.junit.Test;

/**
 * @author:洪文锴
 * @date:Created in 21:34 2022/6/5
 */
public class MyTest {

    @Test
    public void test() {
        //创建UsersController
        UsersController usersController = new UsersController();
        int num = usersController.insert(new Users(100, "zhangsan", "100"));
        System.out.println(num);
    }
}
