package com.kosa.adress;

public class PhoneInfo {

	
	String name;
	String phonenumber;
	String email;
	
	
	public PhoneInfo() {
		
	}
	
    public PhoneInfo(String name, String phonenumber){
    	
    	this.name = name;
    	this.phonenumber = phonenumber;
    }
    
    

    public PhoneInfo(String name, String phonenumber, String email){
    	
    	this.name = name;
    	this.phonenumber = phonenumber;
    	this.email = email;
    	
    }
    
    
    public void showPhoneInfo() {
    	
    	System.out.println("Name :"+name);
    	System.out.println("PhoneNumber :"+phonenumber);
    	if (email != null) {
    		System.out.println("Email :"+email);
    		System.out.println("---------------------");
    		
    	}else {
    		System.out.println("---------------------");
    	}
    	
    	
    }
    
}
