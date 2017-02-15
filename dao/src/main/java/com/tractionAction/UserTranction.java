package com.tractionAction;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by timhuo on 2017/2/10.
 */
@Component("aop")
@Aspect
public class UserTranction {

    @Before("execution( * com.daoimpl.*.*(..) )")
    public void befault(){
        System.out.println("开始。。。");
    }

    @After("execution( * com.daoimpl.*.*(..) )")
    public void after(){
        System.out.println("结束。。。");
    }

}
