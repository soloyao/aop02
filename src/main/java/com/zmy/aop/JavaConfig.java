package com.zmy.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: MengyaoZeng
 * @Telephone: 18573903136
 * @Email: 343722243@qq.com
 * @Description:
 * @Date: Created in 22:14 2022/1/19
 */
@Configuration
@ComponentScan
//开启自动代理
@EnableAspectJAutoProxy
public class JavaConfig {
}
