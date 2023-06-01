package com.seojava.test01;

import com.seojava.test02.AnotherStudent;

public class StudentTest {
	public static void main(String[] args) { // main 함수 에서 Student 클래스 생성. -> 제일 먼저 실행되고 제일 나중에 종료됨.
		Student student1 = new Student(); //Student Class 생성 01
		Student student2 = new Student(); //Student Class 생성

		
		// class class 변수이름(자료형) = new 생성자 이름
		AnotherStudent anotherStudent  = new AnotherStudent(); // 다른 패키지의 AnotherStudent Class 객체 생성.
		
		String firstVal = student1.studentName = "첫번째 생성자";
		
		String secondVal = student2.studentName = "두번째 생성자";
		
		String anotherP = anotherStudent.stName = "다른 패키지의 클래스 생성자";
		
		
		// new 가 붙으면 동적으로 활용 / static이 붙으면 정적 고정.
		
		System.out.println(student1);
		System.out.println(firstVal); // 첫번째 참조변수 값 출력
		System.out.println("###############################");
		
		System.out.println(student2);
		System.out.println(secondVal); // 두번째 참조변수 값 출력
		
		System.out.println("###############################");
		System.out.println(anotherStudent);
		System.out.println(anotherP);
		
		System.out.println(anotherStudent.sum(9999, 9999));
		
		String str1 = "Hello2";
		String str2 = "Hello";
		String str3 = new String("Hello2");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		if (str1 == str2) 
			System.out.println("str1 == str2");
		
		if (str1.equals(str2)) //equals는 문자열로 비교
			System.out.println("str1.equals(str2)");
		
		if (str1 == str3) 
			System.out.println("str1 == str3");
		
		if (str1.equals(str3)) //equals는 문자열로 비교
			System.out.println("str1.equals(str3)");
		
	}
}
