package com.talib.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/talib/auto/wire/autoconfig.xml");
		
		Employee emp1 = context.getBean("employee", Employee.class);
		System.out.println(emp1);

	}

}
