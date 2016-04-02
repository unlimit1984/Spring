package com.tutorialspoint.ex05_annotations_Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans_ex05_autowired.xml");
		
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();

		Student student = (Student) context.getBean("student");
		System.out.println("Name : " + student.getName());
		System.out.println("Age : " + student.getAge());
		
	}

}
