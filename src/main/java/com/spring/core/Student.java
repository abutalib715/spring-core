package com.spring.core;

public class Student {
	private Integer studentId;
	private String studentName;
	private String studentAddress;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Student(Integer studentId, String studentName, String studentAddress) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student{" +
				"studentId=" + studentId +
				", studentName='" + studentName + '\'' +
				", studentAddress='" + studentAddress + '\'' +
				'}';
	}
}
