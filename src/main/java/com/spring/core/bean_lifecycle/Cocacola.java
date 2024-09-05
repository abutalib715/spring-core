package com.spring.core.bean_lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cocacola {
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Cocacola(String country) {
        this.country = country;
    }

    public Cocacola() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Cocacola{" +
                "country='" + country + '\'' +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("Bean init with Annotation");
    }

    @PreDestroy
    public void end(){
        System.out.println("Bean Destroy with Annotation");
    }
}
