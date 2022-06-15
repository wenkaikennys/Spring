package org.example;

import org.example.pojo2.School;
import org.example.pojo2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:洪文锴
 * @date:Created in 20:45 2022/6/5
 */
public class MyTest02 {

    @Test
    public void testSchool(){
       //创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        //获取对象
        School school = (School) ac.getBean("school");
        System.out.println(school);
    }

    @Test
    public void testStudentSchool(){
        //创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        //获取对象
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }

}

