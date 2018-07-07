package com.decorator.demo;

public class Person {

	public Person () {
		
	}
	
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("Decorated " + this.name);
	}
	
}
