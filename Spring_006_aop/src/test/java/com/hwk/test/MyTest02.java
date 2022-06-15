package com.hwk.test;

import com.hwk.proxy2.BookServiceImpl;
import com.hwk.proxy2.SubBookServiceImpl;
import org.junit.Test;

/**
 * @author:洪文锴
 * @date:Created in 23:09 2022/6/6
 */
public class MyTest02 {

    @Test
    public void Test01(){
        BookServiceImpl bookService = new SubBookServiceImpl();
        bookService.buy();
    }
}
