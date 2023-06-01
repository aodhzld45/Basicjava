package com.seojava.polymorphism;

public class CustomerTest1 {
	public static void main(String[] args) {
		//부모 클래스 직접 인스턴스 생성.
		Customer customerSeo = new Customer(0, null);
		customerSeo.setCustomerID(10010);
		customerSeo.setCustomerName("서현석");
		customerSeo.bonusPoint = 1000;
		System.out.println(customerSeo.showCustomerInfo());
		
		// 객체 참조 변수는 부모 클래스 타입 실제로는 자식 클래스로 인스턴스 생성.
		// 묵시적 형변환 -> 업캐스팅이라고 함.
		Customer customerKim = new VIPCustomer(0, null, 0);
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김다정");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		//명시적 형변환 -> 다운캐스팅
		System.out.println(((VIPCustomer)customerKim).getAgentID());
		
		VIPCustomer customerSeo2 = new VIPCustomer(0, null, 0);
		customerSeo2.setCustomerID(10030);
		customerSeo2.setCustomerName("서현지");
		customerSeo2.bonusPoint = 10000;
		System.out.println(customerSeo2.showCustomerInfo());
		
		System.out.println("##############################");
		System.out.println("메서드 오버라이딩 예제");

		Customer customerLee = new Customer(1001, "이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerPark = new VIPCustomer(1002, "박완서", 12345);
		customerPark.bonusPoint = 10000;
		
		int price = 20000;
		
		System.out.println(customerLee.getCustomerName() + "님이 지불해야 할 금액은 : " + customerLee.calPrice(price) + " 원 입니다.");
		System.out.println(customerPark.getCustomerName() + "님이 지불해야 할 금액은 : " + customerPark.calPrice(price) + " 원 입니다.");

		
	}
}
