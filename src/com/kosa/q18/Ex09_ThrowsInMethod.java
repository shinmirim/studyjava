package com.kosa.q18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09_ThrowsInMethod {

	public static void myMethod1(){
		myMethod2();
		
		
	
		
	}
	
	public static void myMethod2() throws ArithmeticException, InputMismatchException{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("좋아하는 숫자를 입력하세요");
		
		int num = sc.nextInt();
		
		System.out.println(num);
	}




	public static void main(String[] args) {
		
	
		
		try {
		myMethod1();
		}catch (ArithmeticException|InputMismatchException e) {
			e.printStackTrace();
		}
	
	}
}