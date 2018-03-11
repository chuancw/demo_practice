package dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import orm.HibernateSessionFactory;

public class PageSearch {
	/**
	 * 
	 * @param pageIndex  当前页码
	 * @param pageSize   页面大小
	 */
   public void pageSearch(int pageIndex,int pageSize){
	      Session session=HibernateSessionFactory.getSession();
	      String hql="from Object as O order by O.param asc";
	      Query query=session.createQuery(hql);
	      int startIndex=(pageSize-1)*pageSize;
	      query.setFirstResult(startIndex);   //从startIndex个对象开始查询
	      query.setMaxResults(pageSize);      //从查询结果中一次返回pageSize个对象
	      List list=query.list();
	      Iterator it=list.iterator();
	      while(it.hasNext()){
	    	    Object o=it.next();
	    	    System.out.println();
	      }
   }
}
