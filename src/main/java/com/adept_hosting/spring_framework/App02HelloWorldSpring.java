package com.adept_hosting.spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("sayHello"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean("person3Parameters"));
	}

}
