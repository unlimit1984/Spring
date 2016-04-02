package com.tutorialspoint.ex05_annotations_others;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_ex05_annotations.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		
		TextEditor textEditor = (TextEditor)context.getBean("textEditor");
		textEditor.spellCheck();
		
		context.registerShutdownHook();
	}

}
