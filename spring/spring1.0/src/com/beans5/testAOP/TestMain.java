package com.beans5.testAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
  public static void main(String[] args){
	  ApplicationContext ac=new ClassPathXmlApplicationContext("beans5.xml");
	  A a=(A) ac.getBean("myFirstAop");
	  a.sayHello();
  }
}
