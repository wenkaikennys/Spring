package com.hwk.proxy5;

/**
 * @author:洪文锴
 * @date:Created in 23:16 2022/6/6
 */
// 子类实现父类的接口
public class BookServiceImpl implements Service {
    @Override
    public void buy() {
        System.out.println("购买图书功能实现：");

    }

    @Override
    public String show(int age) {
        System.out.println("显示图书功能实现：");
        return "购买成功";
    }
}
