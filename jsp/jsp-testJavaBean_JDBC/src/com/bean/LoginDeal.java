package com.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.bean.DBcon;

public class LoginDeal {
	public boolean login(Login login){
		DBcon t=new DBcon();
		String name=login.getUsername();
		String pass=login.getPassword();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		con=t.getConnection();
		try {
			ps=con.prepareStatement("select * from login where username=? and password=?");
			ps.setString(1,name);
			ps.setString(2,pass);
			rs=ps.executeQuery();
			
			if(rs.next()){
				t.close();
				return true;
			}
			else{
				t.close();
				return false;
			}
		} catch (SQLException e) {
			t.close();
			e.printStackTrace();
			return false;
		}
		   
		
	   
		
		
		
		
	}

}
