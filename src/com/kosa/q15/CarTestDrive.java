package com.kosa.q15;

public class CarTestDrive {

	public static void main(String[] args) {
	
		
		  Car jeep = new Jeep("Wrangler", 6000);
	      System.out.println(jeep.getBrand());
	      System.out.println(jeep.getPrice());

	      //Car firstJeep = new Jeep();
	      //System.out.println(firstJeep.getBrand());
	      //System.out.println(firstJeep.getPrice());
	      
	      
	      //Car secondJeep = new Jeep("컴패스");
	      //Car secondJeep = new Jeep(5000); // 차인데 마이너스 100만원일때 되기는 하지만 
	      //Car secondJeep = new Jeep("컴패스",5000);
	      
	}
	
	

}
