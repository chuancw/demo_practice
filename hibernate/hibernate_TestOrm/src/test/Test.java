package test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import orm.A;
import orm.B;
import orm.HibernateSessionFactory;

public class Test {
   public static void main(String[] args){
	      B b1=new B(13,"chinse");
	      B b2=new B(14,"mah");
	      Set set=new HashSet();
	      set.add(b1);
	      set.add(b2);
	      A a=new A("tofgo",62,set);
	      b1.setA(a);
	      b2.setA(a); 
	      HibernateSessionFactory.getSession().beginTransaction();
	      HibernateSessionFactory.getSession().save(a);
	      HibernateSessionFactory.getSession().getTransaction().commit();
	      HibernateSessionFactory.getSession().close();
	      
   }

}