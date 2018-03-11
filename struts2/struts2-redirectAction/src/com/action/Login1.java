package com.action;

public class Login1 {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String execute(){
		
		this.setId(100);
		return "list";
	}

}
