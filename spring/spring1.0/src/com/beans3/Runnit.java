package com.beans3;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runnit {
     public static void main(String[] args){
    	 ApplicationContext ac=new ClassPathXmlApplicationContext("beans3.xml");
    	 
    		  Date date=(Date) ac.getBean("date");
    		  Date date1=(Date)ac.getBean("date");
    		  System.out.println(date==date1);
    
}
}
