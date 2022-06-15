package com.hwk.proxy5;

/**
 * @author:洪文锴
 * @date:Created in 23:56 2022/6/6
 */
public class LogAop implements AOP {

    @Override
    public void before() {
        System.out.println("前置日志输出：");
    }
}
