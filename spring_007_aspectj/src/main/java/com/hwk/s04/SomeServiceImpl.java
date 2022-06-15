package com.hwk.s04;

import org.springframework.stereotype.Service;

/**
 * @author:洪文锴
 * @date:Created in 14:51 2022/6/7
 */
@Service
public class SomeServiceImpl implements SomeService {

    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome被执行：" + name);
//        System.out.println(1/0);
        return "abcd";
    }
}
