package com.hwk.s01;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author:洪文锴
 * @date:Created in 10:45 2022/6/7
 */
@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome方法执行了");
        return "Hello, " + name + ", you are " + age + " years old.";
    }

    @Override
    public void show() {
        System.out.println("show方法执行了");
    }
}
