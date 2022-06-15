package com.hwk.test;

import com.hwk.s02.SomeService;
import com.hwk.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:洪文锴
 * @date:Created in 14:35 2022/6/7
 */
public class MyTest02 {

    @Test
    public void Test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        SomeService ss = (SomeService) ac.getBean("someServiceImpl");
        String str = ss.doSome("张三", 18);
        System.out.println("测试方法中的返回值："+str);
    }

    @Test
    public void Test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        SomeService ss = (SomeService) ac.getBean("someServiceImpl");
        Student stu = ss.change();
        System.out.println("测试方法中的返回值：" + stu);
    }
}
