package com.hwk.test;

import com.hwk.proxy4.*;
import org.junit.Test;

/**
 * @author:洪文锴
 * @date:Created in 0:00 2022/6/7
 */
public class MyTest04 {

    @Test
    public void Test01(){
        Service agent = new Agent(new ProductServiceImpl(), new TransAop());
        Service agent1 = new Agent(agent, new LogAop());
        agent1 .buy();
    }
}
