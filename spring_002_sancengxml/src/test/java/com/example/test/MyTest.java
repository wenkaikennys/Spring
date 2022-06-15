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
        //创建容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("total.xml");

        //取出对象
        UsersController usersController = (UsersController) ac.getBean("uController");

        //测试功能
        int num = usersController.insert(new Users(200, "zhangsan ", 20));
        System.out.println(num);
    }
}
