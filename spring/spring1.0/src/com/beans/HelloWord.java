package com.beans;

public class HelloWord {
       private String name;
       public void setName(String name){
    	   this.name=name;
    	   System.out.println("set方法");
       }
       public void hello(){
    	   System.out.println("hello:"+name);
       }
       public HelloWord(){
    	    System.out.println("构造器初始化");
       }
}
