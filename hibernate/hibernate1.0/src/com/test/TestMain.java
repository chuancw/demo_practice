package com.test;
import com.danlimoshi.*;

import java.util.Date;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.danlimoshi.MySessionFac;
import com.domain.Employee;
public class TestMain {
     public static void main(String[] agrs){
         
          
    	 addEmployee() ;
    	 
    	 
     }
     
	public static void testQuery() {
		Session session=MySessionFac.getSessionFactory().getCurrentSession();
          Transaction T=null;
          try{
        	   T=session.beginTransaction();
        	   Query query=session.createQuery("from Employee where id=3");//hql语句
        	   List<Employee> list =query.list();
        	   for(Employee cc:list){
        		   System.out.println(cc.getId());
        	   }
        	   T.commit();
          }
          catch(Exception e){
        	  if(T!=null){
        		  T.rollback();
        	  }
          }
          finally{
        	  session.close();
        	  
          }
	}
	public static void testOpenSessionAndCurrentSession() {
		  Session s1=MySessionFac.getSessionFactory().getCurrentSession();
          Session s2=MySessionFac.getSessionFactory().getCurrentSession();
          System.out.println("s1:"+s1.hashCode()+" "+"s2:"+s2.hashCode());
          s1.close();
          //s2.close();
	
	}
	public static void deleteEmployee() {
		//删除用户
    	  Session session=MySessionFac.getSessionFactory().openSession();
    	  Transaction T=session.beginTransaction();
    	  Employee emp=(Employee) session.load(Employee.class, 2);
    	  session.delete(emp);
    	  T.commit();
    	  session.close();
	}

	public static void updateEmployee() {    //修改用户
		//模板
		//获取一个会话
		  Session session=MySessionFac.getSessionFactory().openSession();
		 //使用事物提交
    	  Transaction T=null;
    	 //获取一个对象实例
    	 try{
         T=session.beginTransaction();
    	 Employee emp=(Employee)session.load(Employee.class, 2); //select * from employee where id=?
    	 emp.setName("haha12");
    	   int i=4/0;
    	 T.commit();
    	 }
    	catch(Exception e){
    	if(T!=null){
    		T.rollback();
    	}
    	   System.out.println("出现异常"); 
    	}
    	 finally{
    		 session.close();
    	 }
	
	}
	public static void addEmployee() {
		/*
		//读取hibernate.cfg.xml
    	 Configuration configuration=new Configuration().configure();
    	 //创建SessionFactory[这是一个会话工厂，是一个重量级的对象]
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
    	//创建session 
    	Session session=sessionFactory.openSession();  
    	*/    
		
		
		Session session=MySessionFac.getSessionFactory().openSession();
    	Transaction T=session.beginTransaction();
    	
    	Employee emp=new Employee();
    	emp.setName("wangchuan");
    	emp.setEmail("2402873932@qq.com");
    	emp.setHirdate(new Date());
    	session.save(emp);//体现了持久化该对象，保存到数据库中
    	T.commit();
    	session.close();
	}
	//测试get和load
	public static void testGetAndLoad(){
		Session session=MySessionFac.getSessionFactory().openSession();
		Employee emp1=(Employee) session.load(Employee.class, 1);
	    System.out.println(emp1.getName());
	    Employee emp2=(Employee) session.load(Employee.class, 1);
	    System.out.println(emp2.getEmail());
	    Employee emp3=(Employee) session.get(Employee.class, 2);
	    System.out.println(emp3.getHirdate());
	    session.close();
	}
}
