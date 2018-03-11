package com.controller;

import java.util.List;

import com.bean.Users;
import com.dao.UsersDAO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowUsers extends ActionSupport{
        private String type;
        
        public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String showAllUsers(){
        	 UsersDAO dao=new UsersDAO();
        	 List list=dao.showAllUsers();
        	 System.out.println(list.size());
        	 ActionContext.getContext().put("list", list);
        	 if("admion".equals(type)){
        		  return this.INPUT;
        	 }
        	 else{
        		 System.out.println("³É¹¦");
        		 return this.SUCCESS;
        		
        	 }
        	 
        }
}
