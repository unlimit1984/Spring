package com.tutorialspoint.ex05_annotations_Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans_ex05_qualifier.xml");

	      Profile profile = (Profile) context.getBean("profile");

	      profile.printAge();
	      profile.printName();
	}

}
