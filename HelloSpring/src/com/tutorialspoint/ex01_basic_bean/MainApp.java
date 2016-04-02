package com.tutorialspoint.ex01_basic_bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_ex01.xml");
		
		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Beans.xml"});
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage1();
		obj.getMessage2();

//		obj.setMessage1("hello 2");
//		obj.getMessage1();
		
//		HelloIndia obj2 = (HelloIndia) context.getBean("helloIndia");
//		obj2.getMessage1();
//		obj2.getMessage2();
//		obj2.getMessage3();

		context.registerShutdownHook();
	}

}
