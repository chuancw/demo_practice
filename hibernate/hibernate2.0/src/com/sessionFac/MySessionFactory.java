package com.sessionFac;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


final public class MySessionFactory {
         private MySessionFactory(){
        	 
         }
         private static SessionFactory sessionFactory=null;
        
         //单例模式，因为会话工厂是一个重量级的类，耗费内存，所以保证只有一个会话工厂
         static{            
        	sessionFactory= new Configuration().configure().buildSessionFactory();
         }
         public static SessionFactory getSessionFactory(){
        	  return sessionFactory;
         }
}
