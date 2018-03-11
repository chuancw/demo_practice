package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import orm.HibernateSessionFactory;
import orm.Student1;
import orm.Student1DAO;

public class Test3 extends HttpServlet {

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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		/**
		Session session=HibernateSessionFactory.getSession();
		session.beginTransaction();
		Student1DAO dao=new Student1DAO();
		Student1 stu1=dao.findById(1);
		stu1.setStuname("wangchuan");
		stu1.setAge(19);
		session.update(stu1);
		session.getTransaction().commit();
		session.close();
		*/
	    Session session=HibernateSessionFactory.getSession();
	    session.beginTransaction();
	    Student1 stu1=(Student1) session.load(Student1.class, 1);
	    stu1.setStuname("wangchuan");
	    stu1.setAge(19);
	    session.save(stu1);
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
