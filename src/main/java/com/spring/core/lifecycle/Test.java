package com.spring.core.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/lifecycle/config.xml");

        Samosa s1 = (Samosa) context.getBean("samosa1");
        System.out.println(s1);
        context.registerShutdownHook();
        System.out.println("-----------------------------");

        Pepsi p1 = (Pepsi) context.getBean("pepsi");
        System.out.println(p1);

        Cocacola c1 = (Cocacola) context.getBean("cocacola");
        System.out.println(c1);

    }
}
