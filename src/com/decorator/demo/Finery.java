package com.decorator.demo;

public class Finery extends Person {

	protected Person component;
	
	public  void decorate(Person component) {
		// TODO Auto-generated method stub
		this.component = component;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		if(this.component != null) {
			this.component.show();
		}
	}
	
}
