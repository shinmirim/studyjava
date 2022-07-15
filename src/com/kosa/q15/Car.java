package com.kosa.q15;

public class Car {

	private String brand;
	private int price;
	
//	public Car() {
//		this()??// 만들어주는 이유
//				
//	}
	
	public Car(String brand, int price) {
		
		this.brand = brand;
		
		
		
		if (price >= 0) {
			
			this.price = price;
		}else {
			this.price= 0;
			System.out.println("가격은 마이너스일 수 없습니다");
		}
		this.price = price;
		
		
	}
	
	//여기서 set의 경우에는 사용하지 않아도 된다get의 경우에는 값을 줘야하기에 필요한 것 
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand){
		
		this.brand = brand;
		
	}
	
	public int getPrice() {
		return price;
		
	}
	
	public void setPrice(int price) {
	      this.price = price;
	   }
	   
	
	
}
