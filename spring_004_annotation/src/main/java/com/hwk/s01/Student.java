package com.hwk.s01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author:洪文锴
 * @date:Created in 20:25 2022/6/6
 */
@Component("stu")
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
                '}';
    }
}
