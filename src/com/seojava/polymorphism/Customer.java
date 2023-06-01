package com.seojava.polymorphism;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//default 생성자.
//	public Customer() {
//		customerGrade = "Silver"; //기본 등급
//		bonusRatio = 0.01; // 보너스 포인트 기본적립 비율.
//		System.out.println("Customer() 생성자 호출");
//	}
	
	public Customer(int customerID, String customerName) {
//		this(); // 자신의 디폴트 생성자 호출.
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SIlver";
		bonusRatio = 0.01;
		System.out.println("Customer(int customerID, String customerName) 생성자 호출.");
	}

	public int calPrice(int price) {
		 bonusPoint += price * bonusPoint;
		 System.out.println("Customer의 calcPrice 메소드");
		 return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 : " + customerGrade + " 이며, 보너스 포인트는 : " + bonusPoint + " 입니다.";
	}
	

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
	
}
