package com.seojava.test03;

public class Student {
	//	private 을 권장
	private String studentName;
	private int grade;
	private int money;
	
	public static int seialNum = 1000; // static 변수는 별도로 따로 관리가 된다.
	public static final int SEIALNUM = 1000; // final을 붙이면 상수값이 됨. -> 별도로 따로 관리가 된다.

	
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
	
	
}
