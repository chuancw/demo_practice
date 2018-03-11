package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	public String name;
	public String pwd;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String checkLogin(){
	    ActionContext ac = ActionContext.getContext();
	    ac.getSession().put("login", this.name);
	    ac.getApplication().put("login", this.name);
		return "success";
		
	}

}
