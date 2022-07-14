package com.kosa.mirim;

public class CoffeeMachine {

	ShotBehavior shotBehavior;
	BaseBehavior baseBehavior;
	

	
	public void coffeemachine() {
		
	}
	
	
	public  void ice() {
		System.out.println("얼음을 넣어준다.");
	}
	
	public void performshot() {
		
		shotBehavior.shot();
	}
	public void performbase() {
		
		baseBehavior.base();
	}
	
	public void setBaseBehavior(BaseBehavior syrup) {
		
		
		
	}

	
	

	
	
}
