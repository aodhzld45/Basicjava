package com.seojava.arraytest;

public class Book {
	private String bookName;
	private String author;
	
	public Book(){} // 디폴트 생성자 -> 굳이 적어주지 않아도 됨 자동으로 생성됨.

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
	
	
	
	
	
}
