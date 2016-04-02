package com.tutorialspoint.ex05_annotations_Autowired_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans_ex05_autowired_c.xml");
		
		TextEditor te = (TextEditor) context.getBean("textEditor");

		te.spellCheck();

	}

}
