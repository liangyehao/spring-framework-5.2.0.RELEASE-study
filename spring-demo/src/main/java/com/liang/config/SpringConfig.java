package com.liang.config;

import com.liang.service.WelcomeService;
import com.liang.service.impl.WelcomeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/19 11:00
 * @content
 */
@Configuration
public class SpringConfig {

	@Bean
	public WelcomeService welcomeService(){
		return new WelcomeServiceImpl();
	}
}
