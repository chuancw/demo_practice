package com.beans2;

public class Test {
      private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
      public void print_name(){
    	   if(name==null){
    		   System.out.println("the value is null!!!");
    	   }
      }
}
