package com.hwk.s02;

/**
 * @author:洪文锴
 * @date:Created in 14:41 2022/6/7
 */
public class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
