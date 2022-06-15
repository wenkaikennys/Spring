package com.hwk.proxy2;

/**
 * @author:洪文锴
 * @date:Created in 23:02 2022/6/6
 */

/*
 *   使用字类代理的方式进行图书业务和事务切面的拆分
 * */
public class BookServiceImpl {
//    父类中只有干干净净的业务
    public void buy(){
        System.out.println("购买图书功能实现：");
    }

}
