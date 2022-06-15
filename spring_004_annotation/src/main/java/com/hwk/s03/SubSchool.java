package com.hwk.s03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author:洪文锴
 * @date:Created in 20:57 2022/6/6
 */
@Component("schoolZi")
public class SubSchool extends School {
    @Value("清华小学")
    private String name;
    @Value("北京海淀")
    private String address;

    public SubSchool() {
        System.out.println("SubSchool()");
    }

    @Override
    public String toString() {
        return "SubSchool{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
