package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseDao {
	    private static Connection con;
        private static final String DRIVER="oracle.jdbc.driver.OracleDriver";
       // private static final String NAME="scott";
       // private static final String PASSWORD="tiger";
       // private static final String URL="jdbc:oracle:thin:@127.0.0.1:1521:myoracle";
        
        static{                          //单子模式
        	try{
        		Class.forName(DRIVER);     //加载数据库驱动
        	}
        	catch(Exception e){
        		e.printStackTrace();
        	}
        }
        public static Connection getConnection(){  //该方法得到数据库连接
        	 try {
				con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:myoracle","scott","tiger");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
        	 return con;
        }
        public static void closeCon(Connection con){   //以下是关闭资源
        	if(con!=null){
        	    try {
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}	
        	}
        }
        public static void closePt(PreparedStatement pt){
        	if(pt!=null){
        		try {
					pt.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
        	}
        }
        public static void closeRs(ResultSet rs){
        	 if(rs!=null){
        		   try {
					rs.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
        	}
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
