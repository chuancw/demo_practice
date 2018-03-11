package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import orm.HibernateSessionFactory;

public class BaseHibernateDAO {
	 //添加数据
      public  void add(Object obj){
    	    Transaction t=null;
    	    Session session=HibernateSessionFactory.getSession();
    	    try{
    	    	t=session.beginTransaction();
    	    	session.save(obj);
    	    	t.commit();
    	    }
    	    catch(Exception e){
    	    	if(t!=null){
    	    		 t.rollback();
    	    	}
    	    	e.printStackTrace();
    	    }
    	    finally{
    	    	//session.close();
    	    	HibernateSessionFactory.closeSession();
    	    }
    	    
      }
      //加载数据
      public Object get(Class c,int id){
    	   Object obj=null;
    	   Session session=HibernateSessionFactory.getSession();
    	   try{
    		   obj=session.get(c, id);
    	   }
    	   catch(Exception e){
    		   e.printStackTrace();
    	   }
    	   finally{
    		  // session.close();
    		   HibernateSessionFactory.closeSession();
    	   }
    	   return obj;
      }
      //删除数据
      public void delete(Object obj){
    	   Transaction t=null;
    	   Session session=HibernateSessionFactory.getSession();
    	   try{
    		   t=session.beginTransaction();
    		   session.delete(obj);
    		   t.commit();
    	   }
    	   catch(Exception e){
    		    if(t!=null){
    		    	 t.rollback();
    		    }
    		    e.printStackTrace();
    	   }
    	   finally{
    		   
    		   HibernateSessionFactory.closeSession();
    	   }
    	   
      }
      //修改数据
      public void update(Object obj){
    	   Transaction t=null;
    	   Session session=HibernateSessionFactory.getSession();
    	   try{
    		   t=session.beginTransaction();
    		   session.update(obj);
    		   t.commit();
    	   }
    	   catch(Exception e){
    		    if(t!=null){
    		    	 t.rollback();
    		    }
    		    e.printStackTrace();
    	   }
    	   finally{
    		    HibernateSessionFactory.closeSession();
    	   }
    			  
      }
}
