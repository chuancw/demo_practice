package action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class TagAction extends ActionSupport{
	private String name;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public String execute(){
		return "ok";
	}
	public String login(){
		ServletActionContext .getRequest().setAttribute("name", this.name);
		return "ok";
	}

}
