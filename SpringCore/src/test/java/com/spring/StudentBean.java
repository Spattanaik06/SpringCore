package com.spring;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StudentBean implements Serializable
{

	private int StudentId;
	private String studentName,StudentAddress;
	
	
	
	@Override
	public String toString() {
		return "StudentBean [StudentId=" + StudentId + ", studentName=" + studentName + ", StudentAddress="
				+ StudentAddress + "]";
	}
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentBean(int studentId, String studentName, String studentAddress) {
		super();
		StudentId = studentId;
		this.studentName = studentName;
		StudentAddress = studentAddress;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	
}
