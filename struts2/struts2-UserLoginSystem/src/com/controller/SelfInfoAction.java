package com.controller;

import com.bean.Users;
import com.dao.UsersDAO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SelfInfoAction extends ActionSupport {
           
            
			public String selefInfo(){
				   UsersDAO dao=new UsersDAO();
				   String username=(String) ActionContext.getContext().getSession().get("username");
				   Users users=dao.selectInfo(username);
			      System.out.println(username);
				   ActionContext.getContext().getSession().put("users",users);
				  
				   return "success";
				   
			}
}
