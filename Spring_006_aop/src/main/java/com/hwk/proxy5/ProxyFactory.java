package com.hwk.proxy5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author:洪文锴
 * @date:Created in 0:10 2022/6/7
 */
public class ProxyFactory {
//实现动态代理
    public static Object getAgent(Service target, AOP aop) {
        return Proxy.newProxyInstance(
                //类加载器
                target.getClass().getClassLoader(),
                //目标类的所有接口
                target.getClass().getInterfaces(),
                //动态代理的处理器
                new InvocationHandler(){

                    @Override
                    public Object invoke(
                            //代理对象
                            Object proxy,
                            //目标对象的方法
                            Method method,
                            //目标对象的方法的参数
                            Object[] args) throws Throwable {
                        Object object = null;
                        try {
                            //切面
                            aop.before();
                            //调用目标对象的方法
                            object = method.invoke(target, args);
                            //切面
                            aop.after();
                        } catch (Exception e) {
                            //切面
                            aop.exception();
                        }
                        return object;

                    }
                }
        );
    }
}
