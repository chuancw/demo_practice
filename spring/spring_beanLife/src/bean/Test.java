package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
        public static void main(String[] args) {
			  ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
			  Person p=(Person) ac.getBean("person");
			  p.go();
		}
}
