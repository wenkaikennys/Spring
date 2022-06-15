package com.hwk.test;


import com.hwk.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:洪文锴
 * @date:Created in 20:29 2022/6/6
 */
public class MyTest02 {

    @Test
    public void Test01(){
        //创建容器对象并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");

        //获取对象
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }

}
