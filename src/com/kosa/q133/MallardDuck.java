package com.kosa.q133;

public class MallardDuck extends Duck {

	

	public MallardDuck() {
		quackBehavior = new Quack(); 
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("나는 진짜 청둥오리");

	}


}
