package com.adept_hosting.spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};

record Address(String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String sayHello() {
		return "Hello World";
	}

	@Bean
	public String name() {
		return "Mike";
	}

	@Bean
	public int age() {
		return 21;
	}

	@Bean
	public Person person() {
		return new Person("Mike", 4, new Address("First St.", "New York"));
	}

	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}

	@Bean
	public Person person3Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}

	@Bean
	public Address address() {
		return new Address("Main St.", "Durham");
	}
	
}
