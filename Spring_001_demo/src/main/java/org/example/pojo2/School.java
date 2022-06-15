package org.example.pojo2;

/**
 * @author:洪文锴
 * @date:Created in 20:56 2022/6/5
 */
public class School {
    private String name;
    private String address;

    public School() {
        System.out.println("School类的无参构造方法");
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
