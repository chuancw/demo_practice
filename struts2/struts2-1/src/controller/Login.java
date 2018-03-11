package controller;

import service.UserinfoService;

public class Login {
	private String username;
	private String password;
	
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public void setPassword(String password){
		this.password=password;
	}
	
	public String execute(){
		UserinfoService i=new UserinfoService();
		if(i.login(username, password)){
			return "toOKJSP";
		}
		else{
			return "toNOJSP";
		}
	}

}
