package com.liang.service.impl;

import com.liang.service.WelcomeService;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/19 10:59
 * @content
 */
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String welcome(String name) {
		System.out.println("welcome "+name+" !");
		return name;
	}
}
