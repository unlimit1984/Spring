package com.tutorialspoint.ex05_annotations_Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private Integer age;
	private String name;

	@Autowired(required = false)
	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	@Autowired //или
	//@Autowired(required = true) 
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
