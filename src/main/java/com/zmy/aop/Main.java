package com.zmy.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: MengyaoZeng
 * @Telephone: 18573903136
 * @Email: 343722243@qq.com
 * @Description:
 * @Date: Created in 22:15 2022/1/19
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        MyCalculator calculator = ctx.getBean(MyCalculator.class);
        calculator.add(3, 4);
        calculator.min(3, 4);
    }
}
