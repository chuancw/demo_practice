package com.danlimoshi;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

final public class MySessionFac {//不能继承该类
	
	 private static SessionFactory sessionFactory=null;
     private MySessionFac(){
    	 
     }
     static{      //单例模式，保证只有一个会话工厂
    	 sessionFactory=new Configuration().configure().buildSessionFactory();
     }
     public static SessionFactory getSessionFactory(){
    	 return sessionFactory;
     }
}
