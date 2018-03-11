package com.controller;
import com.bean.Users;
import com.dao.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class RegisterAction extends ActionSupport {
         private String username;
         private String password;
         private String name;
         private String nicname;
         private String sex;
         private int age;
         private String email;
         private String phone;
         private String selfshow;
         private String validateCode;         //验证码
         
         
		public String getValidateCode() {
			return validateCode;
		}
		public void setValidateCode(String validateCode) {
			this.validateCode = validateCode;
		}
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
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNicname() {
			return nicname;
		}
		public void setNicname(String nicname) {
			this.nicname = nicname;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getSelfshow() {
			return selfshow;
		}
		public void setSelfshow(String selfshow) {
			this.selfshow = selfshow;
		}
	     
        public String register() throws Exception{
                   UsersDAO dao=new UsersDAO();
                   boolean flag=dao.findUsers(username);
                   if(flag){
                	   System.out.println("用户名已被注册");
                	   return INPUT;
                	   
                   }
                   Users users=new Users();
                   users.setUsername(username);
                   users.setPassword(password);
                   users.setName(name);
                   users.setNicname(nicname);
                   users.setSex(sex);
                   users.setAge(age);
                   users.setEmail(email);
                   users.setPhone(phone);
                   users.setSelfshow(selfshow);
                   
                   int i=dao.save(users);
                   if(i>0){
                	   return SUCCESS;
                   }
                   else{
                	   System.out.println("没有保存成功");
                	   return INPUT;
                	  
                   }
        }
        
        //验证验证码输入是否正确
        public void validate(){
            String s=(String) ActionContext.getContext().getSession().get("randCode");
        	if ("".equals(validateCode) || validateCode == null) {
        	      addFieldError("validateCode","请输入验证码") ;
        	} else {
        	      if (!validateCode.equals(s)) {
        	            addFieldError("validateCode","验证码输入错误");
        	      }
        	} 
        }
         
}























