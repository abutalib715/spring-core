package com.talib.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {


	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
	}

	@Autowired
	public Employee(Address address) {
		System.out.println("Setting value via constructor");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}
