package com.spring.core.bean_lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private Double price;
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Let's buy a pepsi");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Throw it to trash can");
	}
}
