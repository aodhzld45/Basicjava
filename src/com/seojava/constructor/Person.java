package com.seojava.constructor;

public class Person extends Object /* Object가 생략됨 (최상위 클래스)*/{
	String name;
	Integer inte;
	float height;
	double weight;
	char gender;
	boolean married; //결혼 여부
	
	public Person() { // 디폴트 생성자.
//		super(); // 자신이 상속받은 부모 클래스에 대한 레퍼런스 변수로, 부모 클래스의 멤버에 접근할 때 사용
		this("이순신");
		System.out.println("Person() 디폴트 생성자 호출");
	}
	
	public Person(String name) { // 메서드 오버로딩 = 같은 이름의 메서드를 타입이나 매개변수값을 다르게 정의
//		super();// 자신이 상속받은 부모 클래스에 대한 레퍼런스 변수로, 부모 클래스의 멤버에 접근할 때 사용
		this(name, 180);
		System.out.println("Person(String pname) 생성자 호출.");
		this.name = name;
	}

	public Person(String name, int height) {
//		this.name = name;
//		this.height = height;
		this(name, height, 60.0);
		System.out.println("Person(String name, int height) 생성자 호출.");

	}
	
	public Person(String name, int height, double weight) {
		super(); // 자신이 상속받은 부모 클래스에 대한 레퍼런스 변수로, 부모 클래스의 멤버에 접근할 때 사용
		System.out.println("Person(String name, int height, double weight) 생성자 호출.");
		this.name = name;
		this.height = height;
		this.weight = weight;

	}
	
	
	

	
	

}
