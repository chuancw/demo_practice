package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {
	private  String name;
	private  String corp;
	private int price;
	private double max_speed;
	public Car(String name, String corp, int price) {
		super();
		this.name = name;
		this.corp = corp;
		this.price = price;
		
	}
	public Car(String name,String corp,double max_speed){
		 this.name=name;
		 this.corp=corp;
		 this.max_speed=max_speed;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", corp=" + corp + ", price=" + price
				+ ", max_speed=" + max_speed + "]";
	}
	public Car(){
		
	}
	
	public static void main(String[] args){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car=(Car) ac.getBean("car");
		System.out.println(car);
		car=(Car) ac.getBean("car2");
		System.out.println(car);
	}
	
	

}
