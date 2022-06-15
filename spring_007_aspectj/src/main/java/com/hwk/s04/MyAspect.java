package com.hwk.s04;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author:洪文锴
 * @date:Created in 15:13 2022/6/7
 */
@Aspect
@Component
public class MyAspect {

    /*
    * 最终通知方法的规范
    * 1）访问权限是public
    * 2）切面方法没有返回值
    * 3）方法名称自定义
    * 4）方法没有参数，方法有参数也智能是JoinPoint
    * 5）使用@After注解声明
    *  参数：
    *     value：指定切入点
    *
    * */

    @After(value = "execution(* com.hwk.s04.*.*(..))")
    public  void myAfter() {
        System.out.println("最终通知");
    }

}
