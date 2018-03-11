package com.beans2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runnit {
      private Test test;

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}
      public static void main(String[] args){
    	   ApplicationContext ac=new ClassPathXmlApplicationContext("beans2.xml");
    	   Runnit runnit=(Runnit) ac.getBean("runnit");
    	   runnit.getTest().print_name();
      }
}
