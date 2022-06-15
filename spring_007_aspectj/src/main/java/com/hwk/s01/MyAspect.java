package com.hwk.s01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author:洪文锴
 * @date:Created in 10:46 2022/6/7
 */
@Aspect
@Component
public class MyAspect {
    /*
    *   所有的切面功能都是由切面方法来实现的
    * 可以将各种切面都在此类中进行开发
    *
    * 前置功能的切面方法的规范
    *
    * 1)访问权限是public\n
    * * 2)方法的返回值是void\n
    * * 3)方法名称自定义\n
    * * 4)方法没有参数,如果有也只能是JoinPoint类型\n
    * * 5)必须使用@Before注解来声明切入的时机是前切功能和切入点\n
    * *   参数:value  指定切入点表达式"
    * 业务方法
        public String doSome(String name, int age)
    * */
    /*@Before(value = "execution(public String com.hwk.s01.SomeServiceImpl.doSome(String,int))")
    public void myBefore() {
        System.out.println("前置通知");
    }
*/
    @Before(value = "execution(* com.hwk.s01..*(..))")
//    public void myBefore() {
//        System.out.println("前置通知");
//    }
    public void myBefore(JoinPoint jp) {
        System.out.println("前置通知");
        System.out.println("目标方法的签名：" + jp.getSignature());
        System.out.println("目标方法的参数：" + Arrays.toString(jp.getArgs()));
    }

    /*@Before(value = "execution(* com.hwk.s01..*(..))")
    public void myBefore() {
        System.out.println("前置通知");
    }*/

}
