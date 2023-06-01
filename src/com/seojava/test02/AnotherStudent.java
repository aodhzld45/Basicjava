package com.seojava.test02;


public class AnotherStudent {
	int studentId;
	public String stName; // 정적인 변수. 시작부터 메모리 공간에 할당됨. -> 처음부터 끝까지 메모리 공간을 차지
	int grade; 
	String studentName;
	String Department;
	String Address;
	
	

	int sum = 0;
	
	public int sum(int num1, int num2) {
		sum = num1 + num2;
		
		return sum;
	}
	
	
	
	
}
