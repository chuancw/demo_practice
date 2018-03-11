package com.beans1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
   public static void main(String[] args){
	   ApplicationContext ac=new ClassPathXmlApplicationContext("at.xml");
	   Person person=(Person)ac.getBean("person");
	   System.out.println(person);
   }
}
