package org.example;

import org.example.pojo3.School;
import org.example.pojo3.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:洪文锴
 * @date:Created in 19:43 2022/6/6
 */
public class MyTest03 {

    @Test
    public void Test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        School school = (School) ac.getBean("school");
        System.out.println(school);
    }

    @Test
    public void Test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }
}
