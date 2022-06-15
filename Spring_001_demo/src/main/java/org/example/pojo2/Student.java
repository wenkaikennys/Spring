package org.example.pojo2;

/**
 * @author:洪文锴
 * @date:Created in 21:02 2022/6/5
 */
public class Student {
    private String name;
    private int age;

    private School school;

    public Student() {
        System.out.println("Student类的无参构造方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
