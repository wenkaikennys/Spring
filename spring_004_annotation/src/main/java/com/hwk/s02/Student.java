package com.hwk.s02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author:洪文锴
 * @date:Created in 20:44 2022/6/6
 */
@Component
public class Student {
    @Value("张三")
    private String name;
    @Value("22")
    private int age;

    public Student() {
        System.out.println("Student()");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    @Autowired
    @Qualifier("school")
    private School school;



}
