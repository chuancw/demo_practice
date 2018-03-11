package action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DaoImpl;

public class Test {
     public static void main(String[] args) {
		  ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		  DaoImpl d=(DaoImpl) ac.getBean("daoImpl");
		  if(d.login()){
			  System.out.println("³É¹¦");
		  }
		  System.out.println("Ê§°Ü");
		  
	}
}
