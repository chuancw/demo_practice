package controller;

import org.apache.struts2.ServletActionContext;

public class List {
    /*
	private String uRequest;
     private String uSession;
     private String uApplication;
	public String getuRequest() {
		return uRequest;
	}
	public void setuRequest(String uRequest) {
		this.uRequest = uRequest;
	}
	public String getuSession() {
		return uSession;
	}
	public void setuSession(String uSession) {
		this.uSession = uSession;
	}
	public String getuApplication() {
		return uApplication;
	}
	public void setuApplication(String uApplication) {
		this.uApplication = uApplication;
	}
	*/
     public String execute(){
    	 ServletActionContext.getRequest().setAttribute("A","ÄãºÃ");
    	 return "default";
     }
}
