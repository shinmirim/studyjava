package com.kosa.mirim;

public class CoffeeMachine {

	ShotBehavior shotBehavior;
	BaseBehavior baseBehavior;
	

	
	public void coffeemachine() {
		
	}
	
	
	public  void ice() {
		System.out.println("얼음을 넣어준다.");
	}
	
	public void performshot() {
		
		shotBehavior.shot();
	}
	public void performbase() {
		
		baseBehavior.base();
	}
	
	//메소드명은 단어별로 첫글자 대문자 !! //이걸 먼저 생성? // 어떤 것이 넘어올지 모르기에 아래처럼 매개변
	public void setBaseBehavior(BaseBehavior baseBehavior) {
		//여기서 베이스를 시럽으로 바꿔주는 행동 
		this.baseBehavior =  baseBehavior;
		
	}

	
	

	
	
}
