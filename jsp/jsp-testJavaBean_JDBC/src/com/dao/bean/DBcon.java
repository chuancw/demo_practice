package com.dao.bean;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcon {
	Connection con=null;
	String url="jdbc:oracle:thin:@127.0.0.1:1521:myoracle";
	String name="scott";
	String pass="tiger";
    String className="oracle.jdbc.driver.OracleDriver";
	
	//使用工厂模式得到(产生)连接
	
	public  Connection getConnection(){
		
		try{
			//1.加载数据库驱动
			Class.forName(className);
			//2.得到连接
			con=DriverManager.getConnection(url, name, pass);
			return con;
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		
	}
	public void close(){
		try{
		  if(con!=null){
		      con.close();	  
		  }
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		 con=null;   //使用垃圾回收机制
	}
	

}
