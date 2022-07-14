package com.kosa.mirim;

public class CoffeeMachineStart {

	public static void main(String[] args) {
		
		CoffeeMachine Latte = new Latte();
		Latte.ice();
		Latte.performshot();
		Latte.performbase();

		Latte.setBaseBehavior(new Syrup());
	    System.out.println("완성");

	

	}

}
