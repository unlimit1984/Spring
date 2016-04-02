package com.tutorialspoint.ex03_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans_ex03.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans_ex03_ref.xml");

		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();

	}

}
