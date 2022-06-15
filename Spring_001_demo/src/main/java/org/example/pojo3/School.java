package org.example.pojo3;

/**
 * @author:洪文锴
 * @date:Created in 19:39 2022/6/6
 */
public class School {
    private String name;
    private String address;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
