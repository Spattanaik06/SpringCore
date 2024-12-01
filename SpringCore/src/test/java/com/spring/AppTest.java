package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest
{
	public static void main(String[] args) 
	{
//		StudentBean sb=new StudentBean(); 
//		sb.setStudentId(123);
//		sb.setStudentName("Suresh");
//		sb.setStudentAddress("Nachuni");
//		System.out.println(sb);
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentBean student1=(StudentBean)context.getBean("Student1");
		System.out.println(student1);


		
	}
}
