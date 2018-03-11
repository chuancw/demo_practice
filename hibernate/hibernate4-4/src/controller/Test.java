package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import orm.Main13;
import orm.Main13DAO;

public class Test extends HttpServlet {

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
      
		 Main13 m1=new Main13();
		 m1.setAge(18);
		 m1.setPassword("12345");
		 m1.setUsername("Tom");
		 
		 Main13 m2=new Main13();
		 m2.setAge(19);
		 m2.setPassword("11111");
		 m2.setUsername("Tinna");
		 
		 Main13 m3=new Main13();
		 m3.setAge(24);
		 m3.setPassword("222222");
		 m3.setUsername("nihao");
		 
		 Main13DAO dao=new Main13DAO();
		 Session session=dao.getSession();
		 session.beginTransaction();
		 session.save(m1);
		 session.save(m2);
		 session.save(m3);
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
