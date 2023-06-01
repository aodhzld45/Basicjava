package com.seojava.singleton;

// Singleton 패턴 - 인스턴스를 단 하나만 생성하는 디자인 패턴 static을 이용.
public class Company {
	private static Company instance = new Company(); // 유일하게 생성한 인스턴스
	
	private Company() {
		System.out.println("Company 생성자 호출.");
	}
	
	// 외부에서 참조 할 수 있는 public method 만들기
	public static Company getInstance() {
		if (instance == null) { // 객체가 만들어져 있지 않으면 
			instance = new Company(); // 인스턴스 생성.
		}
		return instance; // 유일하게 생성한 인스턴스 반환.
	}
	

}
