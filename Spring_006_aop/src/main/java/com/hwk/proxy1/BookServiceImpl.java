package com.hwk.proxy1;

/**
 * @author:洪文锴
 * @date:Created in 23:00 2022/6/6
 */
/*
    图书购买业务和事务 切面耦合
* */
public class BookServiceImpl {

    public void buy(){
        try{
            System.out.println("事务开启。。。。。");
            System.out.println("购买图书：");
            System.out.println("事务提交。。。。。");
        } catch (Exception e) {
            System.out.println("事务回滚。。。。。");
        }

    }
}
