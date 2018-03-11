package action;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {
	private String name;
	private double price;
	private int num;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public int getNum(){
		return num;
	}
	public  void setNum(int num){
		this.num=num;
	}
	
	public String addBook(){
		return "success";
	}
	

}
