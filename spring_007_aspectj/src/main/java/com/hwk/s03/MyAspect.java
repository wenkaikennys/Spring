package com.hwk.s03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author:洪文锴
 * @date:Created in 14:52 2022/6/7
 */
@Aspect
@Component
public class MyAspect {

    /*
     *   环绕通知方法的规范
     * 1）访问权限是public
     * 2）切面方法有返回值，此返回值就是目标方法的返回值
     * 3）方法名称自定义
     * 4）方法有参数，此参考就是目标方法
     * 5）回避异常
     * 6）使用@Around注解声明
     *   参数：
     *       value：指定切入点
     * */
    @Around(value = "execution(* com.hwk.s03.*.*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        //前切功能实现
        System.out.println("前置通知");
        //目标方法调用
        Object obj = pjp.proceed(pjp.getArgs());
        //后切功能实现
        System.out.println("后置通知");
        return "在测试方法中目标方法的返回值："+obj.toString().toUpperCase();

    }
}
