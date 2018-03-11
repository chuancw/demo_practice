package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.News;
import com.sessionFac.MySessionFactory;

public class Test {
   public static void main(String[] args){
	     Session session=MySessionFactory.getSessionFactory().openSession();
	     Transaction t=session.beginTransaction();
	     News n=new News();
	     n.setName("wc");
	     n.setEmail("2324@qq.com");
	     session.save(n);
	     t.commit();
	     session.close();
	     
   }
} 
