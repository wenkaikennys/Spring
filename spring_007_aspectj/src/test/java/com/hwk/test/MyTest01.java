package com.hwk.test;

import com.hwk.s01.SomeService;
import com.hwk.s01.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:洪文锴
 * @date:Created in 11:13 2022/6/7
 */
public class MyTest01 {

    @Test
    public void Test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        SomeService ss = (SomeService) ac.getBean("someServiceImpl");
        System.out.println(ss.getClass());
        String str = ss.doSome("张三", 18);
        System.out.println(str);
    }

    @Test
    public void Test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        SomeService ss = (SomeService) ac.getBean("someService");
        ss.show();
    }

    @Test
    public void Test03(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        SomeService ss = (SomeService) ac.getBean("someServiceImpl");
        ss.show();
    }
}
