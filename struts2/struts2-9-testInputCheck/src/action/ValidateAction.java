package action;

import com.opensymphony.xwork2.ActionSupport;

public class ValidateAction extends ActionSupport {
          private String name;
          private String password;
          public String getName(){
        	  return name;
          }
          public void setName(String name){
        	  this.name=name;
          }
          public String getPassword(){
        	  return password;
          }
          public void setPassword(String password){
        	  this.password=password;
          }
          public String execute(){
        	  return "success";
          }
          public void validate(){
        	  if(name==null || name.length()<6 ||name.length()>15){
        		  addFieldError("name", "用户姓名的长度不符合要求");
        	  }
        	  if(password==null||password.length()<8||password.length()>20){
        		  addFieldError("password", "用户密码的长度不符合要求");
        	  }
          }
}
