package com.beans5.testAOP1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
        public static void main(String[] args){
             ApplicationContext ac=new ClassPathXmlApplicationContext("beans5.1.xml");
             A a=(A) ac.getBean("mine");
             a.sayHello();
        }
}
