package com.tutorialspoint.ex05_annotations_others;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		System.out.println("Your Message : " + message);
		return message;
	}

	@PostConstruct//можно убрать и использовать init-method
	public void init() {
		System.out.println("Bean is going through init.");
	}

	@PreDestroy//можно убрать и использовать destroy-method
	public void destroy() {
		System.out.println("Bean will destroy now.");
	}
}
