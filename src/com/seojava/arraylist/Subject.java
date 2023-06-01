package com.seojava.arraylist;

public class Subject {
	private String name;
	private int scorePoint;
	
	//default 생성자 - 생략가능.
	public  Subject() {}
	
	//subject 생성자
	public Subject(String name, int scorePoint) {
		this.name = name;
		this.scorePoint = scorePoint;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	
}
