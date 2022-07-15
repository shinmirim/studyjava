package com.kosa.q15;

public class Jeep extends Car {

	
	 public Jeep() {
		 
		 this("레니게이트",4000);
	 }// 아무것도 안준 상태에서 동작하는 것을 만들 수 있으니 매개변수가 없는 생성자도 생성을 해줘야한다.
	   
	 
	 
		
	 public Jeep(String brand) {
		 
		 this(brand, 0);//this대신 super을 사용할 수 있고 바로 상위 클래스로 연결될 수 있다.
	 }
	 
	 public Jeep(int price) {
		 
		 this("상관없음", price);
	 }
	 
	 
	 
	 
	 
	   public Jeep(String brand, int price) {
//	      this.brand = brand;
//	      this.price = price
		   
		   //this의 경우는 사용할 수 없다. 왜냐하면 변수를 private으로 선언했기 때문에 가져올 수없다.
//	      
//	      setBrand(brand);
//	      setPrice(price);// 이경우는 private의 변수를 바로 가져올 수 없기 떄문에 사용해주지만 이경우는 계속 메소드와 추가를 해줘야하기 때문에 불편하다.
	      
	      // 이게 젤 편함 옆으로 값 추가만 해주ㅁ면 된다. 
		   
	      super(brand, price);
	   }
}
