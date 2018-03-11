package dao;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import orm.SpringHibernateTable;

public class DaoImpl implements Dao{
     private SessionFactory sessionFactory;
     
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean login(){
		   boolean flag=false;
		   Session session=sessionFactory.getCurrentSession();
		   Transaction t=session.beginTransaction();
		   try{
			    String name="aaa";
			    String passwd="123";
			    Query query=session.createQuery("from SpringHibernateTable as s where s.name=? and s.passwd=?");
			    query.setString(0, name);
			    query.setString(1,passwd);
			    Iterator it=query.iterate();
			    while(it.hasNext()){
			    	flag=true;
			    }
			    t.commit();
			   
		   }
		   catch(Exception e){
			  t.rollback();
		   }
		   return flag;
		
		  
	}
       
}
