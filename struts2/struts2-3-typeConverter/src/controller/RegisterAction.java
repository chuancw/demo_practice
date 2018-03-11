package controller;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import entity.Point;

public class RegisterAction extends ActionSupport{
         private String username;
         private int age;
        // private Date insertdate;
        // private Point point;
		
  
         
         public String getUsername() {
			return username;
		}



		public void setUsername(String username) {
			this.username = username;
		}



		public int getAge() {
			return age;
		}



		public void setAge(int age) {
			this.age = age;
		}


/*
		public Date getInsertdate() {
			return insertdate;
		}



		public void setInsertdate(Date insertdate) {
			this.insertdate = insertdate;
		}

*/

	/*	public Point getPoint() {
			return point;
		}



		public void setPoint(Point point) {
			this.point = point;
		}

*/

		public String execute(){
        	 System.out.println(username);
        	 System.out.println(age+1);
        	 //System.out.println(insertdate);
        	 //System.out.println(point);
        	 
        	  return SUCCESS;
         }
         
}
