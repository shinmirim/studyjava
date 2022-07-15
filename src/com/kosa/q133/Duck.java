package com.kosa.q133;

public abstract class Duck {

	FlyBehavior flyBehavior;
	
	

	//클래스와 이름이 같은 생성자
	public Duck() {
		
	}
	
	public abstract void display() {
		
	}
	
	public void performFly() {
		flyBehavior.fly();
		
	}
	public void performQuack() {
		quackBehavior.quack();
		
	}
	

}
