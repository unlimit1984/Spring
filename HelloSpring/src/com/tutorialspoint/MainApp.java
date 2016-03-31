package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args)  {
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Beans.xml"});
		
//		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//		obj.getMessage1();
//		obj.getMessage2();

//		obj.setMessage1("hello 2");
//		obj.getMessage1();
		
//		HelloIndia obj2 = (HelloIndia) context.getBean("helloIndia");
//		obj2.getMessage1();
//		obj2.getMessage2();
//		obj2.getMessage3();

		TextEditor textEditor = (TextEditor)context.getBean("textEditor");
		textEditor.spellCheck();
		
		
		context.registerShutdownHook();
		//context.close();
		
	}

}
