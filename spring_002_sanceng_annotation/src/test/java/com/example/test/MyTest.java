package com.example.test;

import com.example.controller.UsersController;
import com.example.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:洪文锴
 * @date:Created in 21:34 2022/6/5
 */
public class MyTest {

    @Test
    public void test() {
        //创建并启动容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("total.xml");
        //获取容器中的对象
        UsersController usersController = (UsersController) ac.getBean("usersController");
        //调用对象的方法
        usersController.insert(new Users(100,"zhangsan", 23));

    }
}
