package com.gslab.ioc.creator;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.gslab.ioc.Student;

public class StudentCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sobject = new Student(101, "kartik");
		System.out.println(sobject);
		
		Resource resource = new ClassPathResource("student.xml");
		
	}

}
