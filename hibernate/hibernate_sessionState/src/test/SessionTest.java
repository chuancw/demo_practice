package test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import orm.HibernateSessionFactory;
import orm.Hibernate_sessionState_table;

public class SessionTest {
     @Test
     public void test1(){
    	 Session session=null;
    	 Transaction t=null;
    	 Hibernate_sessionState_table h=null;
    	 try{
    		 session=HibernateSessionFactory.getSession();
    		 t=session.beginTransaction();
    		 //瞬时态。
    		 h=new Hibernate_sessionState_table();
    		 h.setName("张三");
    		 h.setPasswd("123");
    		 h.setDate(new Date());
    		 //持久态
    		 session.save(h);
    		 
    		 h.setName("王五");
    		 t.commit();
    	 }
    	 catch(Exception e){
    		  e.printStackTrace();
    		  t.rollback();
    	 }
    	 finally{
    		  if(session.isOpen()){
    			   session.close();
    		  }
    	 }
     }
}
