package com.kosa.mirim;

public class Americano extends CoffeeMachine {

	public Americano() {
		shotBehavior = new ThreeShot();
		baseBehavior = new Water();
		
		
	}
}
