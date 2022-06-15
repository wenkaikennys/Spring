package com.hwk.s02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author:洪文锴
 * @date:Created in 20:43 2022/6/6
 */
@Component
public class School {
    @Value("清华大学")
    private String name;
    @Value("北京")
    private String address;

    public School() {
        System.out.println("School()");
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
