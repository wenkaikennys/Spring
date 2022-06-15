package com.hwk.proxy2;

/**
 * @author:洪文锴
 * @date:Created in 23:04 2022/6/6
 */
public class SubBookServiceImpl extends BookServiceImpl {
    @Override
    public void buy() {
        try{//事务切面
            System.out.println("事务开启：。。。");
            //主业务实现
            super.buy();
            // 事务切面
            System.out.println("事务提交：。。。");
        } catch (Exception e) {
            System.out.println("事务回滚：。。。");
        }
    }
}
