package com.zmy.aop;

import com.zmy.aop.service.MyCalculator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: MengyaoZeng
 * @Telephone: 18573903136
 * @Email: 343722243@qq.com
 * @Description:
 * @Date: Created in 20:38 2022/1/20
 */
public class MainXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyCalculator calculator = ctx.getBean(MyCalculator.class);
        calculator.add(6, 7);
        calculator.min(6, 7);
    }
}
