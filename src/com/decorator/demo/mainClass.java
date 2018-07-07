package com.decorator.demo;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person decoratorPerson = new Person("DecoratorMan");
		Tshirt tshirt = new Tshirt();
		BigTrouser bTrouser = new BigTrouser();
		
		tshirt.decorate(decoratorPerson);
		bTrouser.decorate(tshirt);
		bTrouser.show();
		
	}

}
