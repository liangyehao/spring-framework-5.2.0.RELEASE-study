package com.liang;

import com.liang.config.SpringConfig;
import com.liang.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/19 10:56
 * @content
 */
public class MainTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		WelcomeService welcomeService = ctx.getBean(WelcomeService.class);
		welcomeService.welcome("梁业浩");
		System.out.println("hello spring !");
	}
}
