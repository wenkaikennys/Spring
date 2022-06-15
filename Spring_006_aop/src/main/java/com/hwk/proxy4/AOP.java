package com.hwk.proxy4;

/**
 * @author:洪文锴
 * @date:Created in 23:55 2022/6/6
 */
public interface AOP {

    default void before(){}

    default void after(){}

    default void exception(){}
}
