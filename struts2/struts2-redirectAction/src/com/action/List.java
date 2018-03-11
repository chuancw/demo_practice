package com.action;

import java.util.ArrayList;

public class List {
	    private ArrayList bookList=new ArrayList();

	public ArrayList getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList bookList) {
		this.bookList = bookList;
	}
	 public String execute(){
		 
		 bookList.add("book1");
		 bookList.add("book2");
		 bookList.add("book3");
		 return "bookListJsp";
	 }

}
