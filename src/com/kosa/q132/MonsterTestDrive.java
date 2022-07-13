package com.kosa.q132;

public class MonsterTestDrive {

	public static void main(String[] args) {
		
		Monster [] ma = new Monster[3];
		ma[0] = new Vampire();
		ma[1] = new Dragon();
		ma[2] = new Monster();
		
		for (int x= 0; x< 3; x++) {
			ma[x].frighten(x);
		}
	}

}
//2, 4 x 

class Monster{
	

	boolean frighten(int d) {
		System.out.println("arrrgh");
		return true;
	}
	
}
class Vampire extends Monster{

	
	//오버라이드 
	boolean frighten(int x) {
		System.out.println("a bite?");
		return false;
	}

	
}

class Dragon extends Monster{
	//오버라이드? 
	boolean frighten(int degree) {
		System.out.println("breath fire");
		return true;
	}
}

