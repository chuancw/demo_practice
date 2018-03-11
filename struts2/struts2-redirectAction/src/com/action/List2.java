package com.action;

import java.util.ArrayList;

public class List2 {
     private ArrayList bookList=new ArrayList();
     private int idInfo;
	public ArrayList getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList bookList) {
		this.bookList = bookList;
	}
	public int getIdInfo() {
		return idInfo;
	}
	public void setIdInfo(int idInfo) {
		this.idInfo = idInfo;
	}
	public String execute(){
		
		bookList.add("book1");
		bookList.add("book2");
		return "bookList";
	}
}
