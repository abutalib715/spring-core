package com.spring.core.standalone_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/standalone_collection/standaloneconfig.xml");
		
		Person person = context.getBean("person", Person.class);
		System.out.println(person);

	}

}
