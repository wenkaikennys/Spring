package com.hwk.proxy5;

/**
 * @author:洪文锴
 * @date:Created in 23:57 2022/6/6
 */
public class TransAop implements AOP {

        @Override
        public void before() {
            System.out.println("事务开启。。。");
        }

        @Override
        public void after() {
            System.out.println("事务提交。。。");
        }

        @Override
        public void exception() {
            System.out.println("事务回滚。。。");
        }


}
