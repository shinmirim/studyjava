package com.kosa.mirim;

public class CoffeeMachineStart {

	public static void main(String[] args) {
		
		//인스턴스와 클래스를 잘구분하여 이름을 짓자. 인스턴스 접근시 소문자 클래스 접근시 대문
		CoffeeMachine latte = new Latte();
		latte.ice();
		latte.performshot();
	    latte.performbase();
		
		BaseBehavior syrup = new Syrup();//나는 바꿔야겠다 
		latte.setBaseBehavior(syrup);//바꿔주세요 
		latte.performbase();

		//Latte.setBaseBehavior(new Syrup());
	    System.out.println("완성");

	

	}

}
