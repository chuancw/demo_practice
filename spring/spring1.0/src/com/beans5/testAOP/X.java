package com.beans5.testAOP;

public class X implements A{
     private String name;
     
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("X "+name);
	}
  
}
