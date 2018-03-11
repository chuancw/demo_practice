package controller;

import com.opensymphony.xwork2.ActionSupport;

import entity.UserInfo;

public class LoginAction extends ActionSupport{
         private UserInfo info=new UserInfo();

		public UserInfo getInfo() {
			return info;
		}

		public void setInfo(UserInfo info) {
			this.info = info;
		}
       
		public void validate(){
			 if("".equals(info.getUsername())){
				  this.addFieldError("username", "«Î ‰»Î’À∫≈");
				  
			 }
			 if("".equals(info.getPassword())){
				  this.addFieldError("password","«Î ‰»Î√‹¬Î");
			 }
		}
		public String execute(){
			return "cc";
		}
		
}