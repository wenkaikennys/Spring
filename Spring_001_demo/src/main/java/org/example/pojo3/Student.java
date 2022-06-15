package org.example.pojo3;

/**
 * @author:洪文锴
 * @date:Created in 19:58 2022/6/6
 */
public class Student {

    private String name;
    private int age;

    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
