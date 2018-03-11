package test;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import action.TestAction;

public class TestAnnotation { 
	
		 
	       
		   public static void main(String[] args) {
			   ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
			   TestAction ta=(TestAction) a.getBean("testAction");
			   ta.go();
		}
	
}
