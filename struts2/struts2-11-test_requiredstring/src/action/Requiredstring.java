package action;

import com.opensymphony.xwork2.ActionSupport;

public class Requiredstring extends ActionSupport{
	   private String name;
	   private String password;
	   public void setName(String name){
		   this.name=name;
	   }
	   public String getName(){
		   return name;
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
	   
	    
}
