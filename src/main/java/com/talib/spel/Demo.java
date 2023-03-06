package com.talib.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{12+32}")
	private int x;
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private int z;
	
	@Value("#{ T(java.lang.Math).PI }")
	private Double pi;

	@Value("#{ new java.lang.String('talib') }")
	private String name;
	
	@Value("#{ 6>3 }")
	private Boolean isActive;
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Double getPi() {
		return pi;
	}
	public void setPi(Double pi) {
		this.pi = pi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	
}
