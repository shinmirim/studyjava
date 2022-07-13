package com.kosa.q13;

public class Wolf extends Canine {

	
	public void maksNoise() {
		System.out.println("소리를 냅니다!");
	}
	
	public void eat() {
		System.out.println("소리를 냅니다!");
	}
	
	public void changeToHuman() {
		System.out.println("나는 늑대인간이다");
	}

	
	public void printLocation() {
		
	}
	
	public void printAge() {
		
		System.out.println("현재나이"+getAge());
		
	}//age에 직접 접근하지 않고 getage를 사용하여 가져오게 된다.
	//왜냐하면 상위클래스에서 age를 private로 사용했기때문이다. 
}


