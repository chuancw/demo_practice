package controller;

import service.UserinfoService;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{
            private String username;
            private String password;
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
            
            public void validate(){
            	 if("".equals(this.username)){
            		  this.addFieldError("username","对不起，用户名不可以为空！");
            	 }
            	 if("".equals(this.password)){
            		 this.addFieldError("password","对不起，密码不可以为空！");
            	 }
            }
            public String execute(){
            	 UserinfoService us=new UserinfoService();
            	 if(us.login(username, password)){
            		   return "success";
            		   
            	 }
            	      System.out.println(username);
                       return "error";
                       
            	  
            }
            
}
