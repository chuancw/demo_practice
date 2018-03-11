package action;

import com.opensymphony.xwork2.ActionSupport;

public class ValidateAction extends ActionSupport{
	
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
	public String login(){
		return SUCCESS;
	}
	public void validateLogin(){
		if(name!=null){
			addFieldError("name","validaeXxx()方法被执行:姓名不合法");
			
		}
	}

}
