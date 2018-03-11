package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
   public static void main(String[] args){
	    //创建IOC容器，其是一个接口
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        
        HelloWord helloword=(HelloWord) ac.getBean("helloword");
        helloword.hello();
   }

public static void usualDo() {
	HelloWord helloword=new HelloWord();
	 helloword.setName("haha");
	 helloword.hello();  
}
}
