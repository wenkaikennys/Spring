package com.hwk.s02;

import org.springframework.stereotype.Service;

/**
 * @author:洪文锴
 * @date:Created in 14:28 2022/6/7
 */
@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome方法执行了");
        return "Hello, " + name + ", you are " + age + " years old.";
    }

    @Override
    public Student change() {
        System.out.println("change方法执行了");
        return new Student("张三");
    }


}
