package com.domain;

import java.io.Serializable;
import java.util.Date;
//序列化该pojo类
public class Employee implements Serializable{
	   
       /**
	 * 
	 */
	   private static final long serialVersionUID = 1L;//生成一个序列版本号
	   private Integer id;
       private String name;
       private String email;
       private Date hirdate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getHirdate() {
		return hirdate;
	}
	public void setHirdate(Date hirdate) {
		this.hirdate = hirdate;
	}
       
}
