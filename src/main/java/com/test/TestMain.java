package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.service.TestService;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring.xml");
		TestService tree = (TestService) context.getBean("treeSerivce");
		tree.sallHolle();
	}
}
