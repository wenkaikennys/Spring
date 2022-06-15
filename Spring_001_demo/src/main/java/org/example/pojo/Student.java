package org.example.pojo;

/**
 * @author:洪文锴
 * @date:Created in 20:44 2022/6/5
 */
public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("Student类的无参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
