package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Users;
import com.controller.RegisterAction;

public class UsersDAO {
	  private Connection con;
	  private PreparedStatement pt;  //可以使用占位符
	  private ResultSet rs;
      public boolean findUsers(String username){
    	     boolean flag=false;
    	     con=DatabaseDao.getConnection();
    	     try{  
    	    	 pt=con.prepareStatement("select * from users where username=?");
    	    	 pt.setString(1, username);
    	    	 rs=pt.executeQuery();
    	    	 while(rs.next()){ 
    	    		 flag=true;
    	    	 }
    	     }
    	     catch(Exception e){
    	    	 e.printStackTrace();
    	     }
    	     finally{
    	    	 DatabaseDao.closeRs(rs);
    	    	 DatabaseDao.closePt(pt);
    	    	 DatabaseDao.closeCon(con);
    	     }
    	     return flag;
      }
      public int save(Users user){
    	     int i=0;
    	     con=DatabaseDao.getConnection();
    	     try{
    	    	  //开始事务，取消默认提交
    	    	 con.setAutoCommit(false);  
    	    	 pt=con.prepareStatement("insert into users  values(users_seqence1.nextval,?,?,?,?,?,?,?,?,?)");
    	    	 
    	    	 pt.setString(1,user.getUsername());
    	    	 pt.setString(2,user.getPassword());
    	    	 pt.setString(3,user.getName());
    	    	 pt.setString(4, user.getNicname());
    	    	 pt.setString(5, user.getSex());
    	    	 pt.setInt(6,user.getAge());
    	    	 pt.setString(7,user.getEmail());
    	    	 pt.setString(8,user.getPhone());
    	    	 pt.setString(9,user.getSelfshow());
    	    	 
    	    	 i=pt.executeUpdate();
    	    	 //提交
    	    	 con.commit();
    	     }
    	     catch(Exception e){
    	    	 e.printStackTrace();
    	    	 try {
    	    		 //出现异常，回滚
					con.rollback();
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
    	     }
    	     finally{
    	    	  DatabaseDao.closePt(pt);
    	    	  DatabaseDao.closeCon(con);
    	     }
    	     return i;
      }
      public boolean login(Users users){
    	  boolean flag=false;
    	  con=DatabaseDao.getConnection();
    	  try{
    		  pt=con.prepareStatement("select * from users where username=? and password=?");
    		  
    		  pt.setString(1,users.getUsername());
    		  pt.setString(2,users.getPassword());
    		  
    		  rs=pt.executeQuery();
    		  while(rs.next()){
    			  flag=true;
    		  }
    	  }
    		  catch(Exception e){
    			  e.printStackTrace();
    		  }
    		  finally{
    			  DatabaseDao.closeRs(rs);
    			  DatabaseDao.closePt(pt);
    			  DatabaseDao.closeCon(con);
    			  
    		  }
    		  return flag;		  
    	  
      }
      public List showAllUsers(){
    	    List list=new ArrayList<Users>();
    	    con=DatabaseDao.getConnection();
    	    try{
    	    	pt=con.prepareStatement("select * from users");
    	    	rs=pt.executeQuery();
    	    	while(rs.next()){
    	    	   Users user=new Users();
    	    	   user.setId(rs.getInt(1));
    	    	   user.setUsername(rs.getString(2));
    	    	   user.setPassword(rs.getString(3));
    	    	   user.setName(rs.getString(4));
    	    	   user.setNicname(rs.getString(5));
    	    	   user.setSex(rs.getString(6));
    	    	   user.setAge(rs.getInt(7));;
    	    	   user.setEmail(rs.getString(8));
    	    	   user.setPhone(rs.getString(9));
    	    	   user.setSelfshow(rs.getString(10));
    	    	   list.add(user);
    	    	}
    	    }
    	    catch(Exception e){
    	    	e.printStackTrace();
    	    }
    	    finally{
    	    	  DatabaseDao.closeRs(rs);
    			  DatabaseDao.closePt(pt);
    			  DatabaseDao.closeCon(con);
    	    }
    	    return list;
      }
      
      //查看个人信息
      public Users selectInfo(String username){
    	  Users users=new Users();
    	  con=DatabaseDao.getConnection();
    	  try{
    		  pt=con.prepareStatement("select * from users where username=?");
    		  pt.setString(1, username);
    		  //System.out.println(username);
    		  rs=pt.executeQuery();
    		  if(rs.next()){
    			  users.setId(rs.getInt(1));
    			  users.setUsername(rs.getString(2));
                  users.setPassword(rs.getString(3));
                  users.setName(rs.getString(4));
                  users.setNicname(rs.getString(5));
                  users.setSex(rs.getString(6));
                  users.setAge(rs.getInt(7));
                  users.setEmail(rs.getString(8));
                  users.setPhone(rs.getString(9));
                  users.setSelfshow(rs.getString(10));
                  //System.out.println(rs.getInt(1));
    		  }
    	  }
    	  catch(Exception e){
    		  e.printStackTrace();
    	  }
    	  finally{
    		  DatabaseDao.closeRs(rs);
    		  DatabaseDao.closePt(pt);
    		  DatabaseDao.closeCon(con);
    	  }
    	  return users;
      }
      //修改个人信息
	public int update(Users users) {
			int i=0;
			con=DatabaseDao.getConnection();
			try{
				//获得预处理对象
				pt=con.prepareStatement("update users set password=?,name=?,nicname=?,sex=?,phone=?,email=?,selfshow=?,age=? where id=?");
				pt.setString(1,users.getPassword());
				pt.setString(2,users.getName());
				pt.setString(3,users.getNicname());
				pt.setString(4,users.getSex());
				pt.setString(5,users.getPhone());
				pt.setString(6,users.getEmail());
				pt.setString(7,users.getSelfshow());
				pt.setInt(8,users.getAge());
				pt.setInt(9,users.getId());
				i=pt.executeUpdate();
				
			}
				catch(Exception e){
					 e.printStackTrace();
				}
			    finally{
				DatabaseDao.closePt(pt);
	    	    DatabaseDao.closeCon(con);
			}
			
			
			return i;
	}      
}
