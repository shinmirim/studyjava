package com.kosa.q15;


class Animal{
  private String name;
  public String getName() {
     return name;
  }
  
  
  
  //아무것도 안줘도 생성자는 생성해준다. 
  public Animal() {
	  
  }
  
  //혹쉬 이 부분이 name을 받아오는 부부인가아 ~!
  public Animal (String theName) {
     name = theName;
  }
}
class Hippo extends Animal{
  public Hippo(String name) {
     super(name);
  }
}

class MakeHippo{
  public static void main(String[] args) {
     Hippo h = new Hippo("buffy");
     System.out.println(h.getName());
  }
}