package com.kosa.q133;

public class RubberDuck extends Duck {

	

	public RubberDuck() {
		quackBehavior = new Quack(); 
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("나는 진짜 고무오리");

	}
}
