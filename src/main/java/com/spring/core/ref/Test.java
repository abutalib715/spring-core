package com.spring.core.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/ref/refconfig.xml");

        A a = (A) context.getBean("beanA");
        System.out.println(a);
    }
}
