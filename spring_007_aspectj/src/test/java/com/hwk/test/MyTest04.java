package com.hwk.test;

import com.hwk.s04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:洪文锴
 * @date:Created in 14:57 2022/6/7
 */
public class MyTest04 {

    @Test
    public void Test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s04/applicationContext.xml");
        //获取对象
        SomeService ss = (SomeService) ac.getBean("someServiceImpl");
        String s = ss.doSome("张三", 18);
        System.out.println(s);
    }
}
