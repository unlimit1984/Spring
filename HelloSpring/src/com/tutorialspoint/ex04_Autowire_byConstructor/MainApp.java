package com.tutorialspoint.ex04_Autowire_byConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans_ex04_byConstructor.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");

		te.spellCheck();
	}

}
