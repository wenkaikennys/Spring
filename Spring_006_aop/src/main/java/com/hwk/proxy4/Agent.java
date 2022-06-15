package com.hwk.proxy4;

/**
 * @author:洪文锴
 * @date:Created in 23:58 2022/6/6
 */
public class Agent implements Service {
    //传入业务对象
    private Service target;
    private AOP aop;

    // 构造方法注入
    public Agent(Service target, AOP aop) {
        this.target = target;
        this.aop = aop;
    }

    @Override
    public void buy() {
        try {
            //切面
            aop.before();
            //调用业务方法
            target.buy();
            //切面
            aop.after();
        } catch (Exception e) {
            //切面
            aop.exception();
        }
    }
}
