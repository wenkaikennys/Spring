package com.hwk.test;

import com.hwk.proxy5.*;
import org.junit.Test;

/**
 * @author:洪文锴
 * @date:Created in 0:24 2022/6/7
 */
public class MyTest05 {

    @Test
    public void Test01(){
        //得到动态代理对象
        Service agent = (Service) ProxyFactory.getAgent(new ProductServiceImpl(), new TransAop());
        agent.buy();
    }

    @Test
    public void Test02(){
        //得到动态代理对象
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImpl(), new TransAop());
        String s = agent.show(10);
        System.out.println(s);
    }
}
