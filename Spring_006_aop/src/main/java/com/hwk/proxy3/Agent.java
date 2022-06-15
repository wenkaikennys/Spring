package com.hwk.proxy3;

/**
 * @author:洪文锴
 * @date:Created in 23:17 2022/6/6
 */
/*
*   静态代理已经实现了目标对象的灵活切换
* */
public class Agent implements Service {

    private Service target;

    //使用构造器注入目标对象
    public Agent(Service target) {
        this.target = target;
    }

    @Override
    public void buy() {
        try {
            //事务切面
            System.out.println("事务开启：。。。");
            //业务切面
            target.buy();
            //事务切面
            System.out.println("事务提交：。。。");
        } catch (Exception e) {
            System.out.println("事务回滚：。。。");
        }
    }
}
