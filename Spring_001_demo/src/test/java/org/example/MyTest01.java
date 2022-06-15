package org.example;

import org.example.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:洪文锴
 * @date:Created in 20:45 2022/6/5
 */
public class MyTest01 {

    @Test
    public void testStudent(){
        // 创建Student对象
        Student student = new Student();
        // 输出Student对象
        System.out.println(student);
    }

    @Test
    public void testStudentSpring(){
        //由Spring容器创建Student对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        Student stu = (Student) ac.getBean("stu");
        System.out.println(stu);
    }
}

