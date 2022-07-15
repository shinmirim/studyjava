package com.kosa.q15;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("랜덤 숫자를 입력하세요:");
		int n = sc.nextInt();
		
		int num[] = new int [n];
		
 	  	// 번호 생성
	for(int i=0; i<n; i++) {
		num[i] = (int)(Math.random() * 24) + 1;
        
   		  	 // 중복 번호 제거
		for(int j=0; j<i; j++) {
			if(num[i] == num[j]) {
				i--;
				break;
			}
		}
	}
	System.out.print("발표할 숫자: ");

	 // 번호 출력
	for(int i=0; i<n; i++) {
		System.out.print(num[i] + " ");
	}	
	
		
		
}

}