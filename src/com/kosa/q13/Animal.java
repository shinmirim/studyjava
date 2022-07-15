package com.kosa.q13;

public abstract class Animal {

	String picture;
	String food;
	String hunger;
	String boundaries;
	String location;
	private int age;
	

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}


	public abstract void maksNoise();
	
	public void eat() {
		System.out.println("먹습니다.");
	}
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	public void roam() {
		System.out.println("무슨 류인가");
	}
}
