package com.hwk.proxy5;

/**
 * @author:洪文锴
 * @date:Created in 23:16 2022/6/6
 */
public interface Service {
    //规定业务功能
    void buy();

    //规定业务功能（有返回值）
    default String show(int age) {
        return null;
    }
}
