package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;

import orm.Main13;
import orm.Main13DAO;

public class Test_zhanweifu extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        Main13DAO dao=new Main13DAO();
        Session session=dao.getSession();
        session.beginTransaction();
        Query q=session.createQuery("from Main13 as m where m.id=?");
        q.setInteger(0, 5);
      //Query q=session.createQuery("from Main13 as m where m.id=:d");   //可以有效地防止sql注入
      //q.setInteger("d",5);
        
        List<Main13> list=q.list();
        for(Main13 c:list){
        	System.out.println(c.getId());
        }
        session.getTransaction().commit();
        session.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
   doGet(request,response);
	}

}
