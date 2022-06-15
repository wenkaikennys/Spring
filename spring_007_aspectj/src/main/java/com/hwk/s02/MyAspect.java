package com.hwk.s02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author:洪文锴
 * @date:Created in 14:29 2022/6/7
 */
@Aspect
@Component
public class MyAspect {
    /*
     *   后置通知的规则
     * 1)访问权限是public
     * 2)方法的返回值是void
     * 3)方法名称自定义
     * 4)方法有参数（也可以没有参数，如果目标方法没有返回值，
     * 则可以写无参的方法，但一般会写有参，这样既可以处理无参也可以处理有参
     * 这个切面方法的参数就是目标方法的返回值
     * 5)必须使用@AfterReturning注解来声明切入的时机是后切功能和切入点
     * 参数:
     *      value  指定切入点表达式
     *     returning  指定参数名称
     * */
    @AfterReturning(value = "execution(* com.hwk.s02.*.*(..))",
            returning = "obj")
    public void myAfterReturning(Object obj) {
        System.out.println("后置通知");
        if (obj != null) {
            if (obj instanceof String) {
                obj = obj.toString().toUpperCase();
                System.out.println("在切面方法目标方法的返回值：" + obj);
            }
            if (obj instanceof Student) {
                Student stu = (Student) obj;
                stu.setName("lisi");
                System.out.println("在切面方法目标方法的返回值：" + stu);
            }
        }
    }
}
