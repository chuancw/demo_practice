package com.controller;

import com.bean.Users;
import com.dao.UsersDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction  extends ActionSupport{
	private int id;
	private String username;      //用户名
	private String password;
	private String name;          //真实姓名
	private String nicname;       //昵称
	private String sex;
	private int age;
	private String email;
	private String phone;
	private String selfshow;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public String update(){
		  Users users=new Users();
		  UsersDAO dao=new UsersDAO();
		  users.setId(id);
		  users.setUsername(username);
          users.setPassword(password);
          users.setName(name);
          users.setNicname(nicname);
          users.setSex(sex);
          users.setAge(age);
          users.setEmail(email);
          users.setPhone(phone);
          users.setSelfshow(selfshow);
          int i=dao.update(users); //如果i>0表示修改成功
          if(i>0){
        	   return "success";
          }else{
        	   return "input";
          }
	}
}
