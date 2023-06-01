package com.seojava.polymorphism;

public class VIPCustomer extends Customer {
	private int agentID;
	double safeRatto;
	
//	Customer의 자식클래스의 VIPCustomer 생성자 생성.
//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		safeRatto = 0.1;
//		agentID = "고객 ID는 1013 " ;
//		System.out.println("VIPCustomer() 생성자 호출.");
//	}
	
// 매개변수가 두개인 생성자 - 오버로딩(같은 이름의 메서드를 타입이나 매개변수가 다르게 재사용하는것.)	
// 추가 - 부모 클래스가 디폴트 생성자가 없을 경우 자식 클래스에서 무조건 부모의 생성자를 호출해야 한다.
	public VIPCustomer(int customerID,  String customerName ,int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		safeRatto = 0.1;
		agentID = 1013;
		this.agentID = agentID;
	}

	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원의 ID는 : " + agentID + " 입니다.";
	}

	@Override // 어노테이션 - 주석 (컴파일러에게 전달할)
	public int calPrice(int price) {
		 bonusPoint += price * bonusPoint;

		 System.out.println("VIPCustomer의 calcPrice 메소드");
		 return (int) (price - price * safeRatto);
	}
	
	
	
	
}
