package com.kosa.q13;

public class AnimalSimulationTestDrive {

	public static void main(String[] args) {
		
		
		Wolf w = new Wolf();//상위타입의 경우에는 레퍼런스 변수는 어떤 클래스도 상관이 없다 => 유지보수 , 코드의 용이성
		//레퍼런스 변수가 할 수 있음을 정하는 것은 타입 
		//상위타입의 레퍼런스로 하위클래스를 만들어서 쓴다. 
		w.maksNoise();
		w.roam();
		w.eat();
		w.sleep();
		w.changeToHuman();
		w.printAge();// 자식클래스에서 다른 메소드 기능을 추가한다면 레퍼런스 변수의 타입을 해당 메소드가 있는 
		
		
		//만약 
		//Animal w = new Wolf();
		//Wolf wolf = (wolf) w; => 다운캐스팅 하지만 이것은 최대한 나오지 않도록 코딩해야한다.
//		w.maksNoise();
//		w.roam();
//		w.eat();
//		w.sleep();
//		w.changeToHuman();// 자식클래스에서 다른 메소드 기능을 추가한다면 레퍼런스 변수의 타입을 해당 메소드가 있는 
		
		
		
		Animal [] animals = new Animal[5];
		animals [0] = new Dog();
		animals [0] = new Cat();
		animals [0] = new Wolf();
		animals [0] = new Hippo();
		animals [0] = new Lion();
		
		for (int i =0; i< animals.length; i++) {
			
			animals[i].eat();
			
			animals[i].roam();
		}
		
		
		PetOwner owner = new PetOwner();
		owner.start();
		
		
	}
	
	
	

}
