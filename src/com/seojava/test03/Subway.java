package com.seojava.test03;

public class Subway {
	String tineNumber;
	int passengerCount;
	int money;
	
	public Subway(String tineNumber) {
		this.tineNumber = tineNumber;
	}
	
	public void take(int money) {
		this.money = money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(tineNumber = "의 승객은 " + passengerCount + "명이고, 수입은" + money + "입니다.");
	}
	
}
