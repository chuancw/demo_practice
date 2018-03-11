package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import orm.Main13;
import orm.Main13DAO;
import orm.Sub13;
import orm.Sub13DAO;

public class Test1 extends HttpServlet {

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
		 Main13 m1=dao.findById(new Long(4));
		 Main13 m2=dao.findById(new Long(5));
		 session.getTransaction().commit();
		 session.close();
		 
		 Sub13 s1=new Sub13();
		 s1.setTitle("title1");
		 s1.setMain13(m1);
		 
		 Sub13 s2=new Sub13();
		 s2.setTitle("title2");
		 s2.setMain13(m1);
		 
		 Sub13 s3=new Sub13();
		 s3.setTitle("title13");
		 s3.setMain13(m2);
 
		 Sub13DAO dao1=new Sub13DAO();
		 Session session1=dao1.getSession();
		 session1.beginTransaction();
		 session1.save(s1);
		 session1.save(s2);
		 session1.save(s3);
		 session1.getTransaction().commit();
		 session1.close();
		 
		 
	
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
