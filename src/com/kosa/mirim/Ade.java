package com.kosa.mirim;

public class Ade extends CoffeeMachine {

	public Ade() {
		shotBehavior = new OneShot();
		baseBehavior = new CarbonatedWater();
		
		
	}
	
     
	
}
