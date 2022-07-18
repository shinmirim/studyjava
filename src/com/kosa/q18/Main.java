package com.kosa.q18;

public class Main {
	public void checkAge(int age)throws ArithmeticException  {
	    if (age < 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
	    }
	    else {
	      System.out.println("Access granted - You are old enough!");
	    }
	  }

	//에러해결하기 
	  public static void main(String[] args) {
	    //checkAge(15); // Set age to 15 (which is below 18...)
	  }

}
