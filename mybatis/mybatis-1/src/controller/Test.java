package controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import orm.MybatisGeneratorjavaUserinfo;

public class Test extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	        try{
	        	MybatisGeneratorjavaUserinfo userinfo=new MybatisGeneratorjavaUserinfo();
	        	userinfo.setUsername("wangchuan");
	        	userinfo.setPassword("970127");
	        	String resource="mybatis-config.xml";
	        	InputStream inputStream=Resources.getResourceAsStream(resource);
	        	SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	        	SqlSession sqlSession=sqlSessionFactory.openSession();
	        	sqlSession.insert("insert",userinfo);
	        	sqlSession.commit();
	        	sqlSession.close();
	        }
	        catch(Exception e){
	        	 e.printStackTrace();
	        }
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		  this.doGet(request, response);
	}

}
