package com.spring.core.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/core/stereotype/stereoconfig.xml");
		
		Student student = con.getBean("student", Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
		System.out.println(student.hashCode());
		
		Student student2 = con.getBean("student", Student.class);
		
		System.out.println(student2.hashCode());
		
	}
}
