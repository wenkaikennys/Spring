package com.hwk.test;

import com.hwk.proxy3.Agent;
import com.hwk.proxy3.BookServiceImpl;
import com.hwk.proxy3.ProductServiceImpl;
import com.hwk.proxy3.Service;
import org.junit.Test;

/**
 * @author:洪文锴
 * @date:Created in 23:20 2022/6/6
 */
public class Mytest03 {
    @Test
    public void Test01(){
        Service agent = new Agent(new BookServiceImpl());
        agent.buy();
    }

    @Test
    public void Test02(){
        Service agent = new Agent(new ProductServiceImpl());
        agent.buy();
    }

}
