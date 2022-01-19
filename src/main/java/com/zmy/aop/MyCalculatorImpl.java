package com.zmy.aop;

import org.springframework.stereotype.Component;

/**
 * @Author: MengyaoZeng
 * @Telephone: 18573903136
 * @Email: 343722243@qq.com
 * @Description:
 * @Date: Created in 22:04 2022/1/19
 */
@Component
public class MyCalculatorImpl implements MyCalculator {
    @Action
    public Integer add(int a, int b) {
//        int i = 1 / 0;
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

//    @Action
    public void min(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
    }
}
