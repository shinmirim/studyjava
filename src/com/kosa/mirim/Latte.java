package com.kosa.mirim;

public class Latte extends CoffeeMachine {

	public Latte() {
		shotBehavior = new TwoShot();
		baseBehavior = new Milk();
		
		
		
	}
}
