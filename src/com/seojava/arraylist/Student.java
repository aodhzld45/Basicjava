package com.seojava.arraylist;

import java.util.ArrayList;

public class Student {
	//인스턴스 변수(멤버 변수)
	
	int studentID; // 0으로 초기화
	String studentName; // null값으로 초기화됨
	ArrayList<Subject> subjectList; // arrayList 선언하기. -> 객체 참조형으로 null값으로 초기화
	
	public Student() {}
	
	//생성자가 호출되면 Heap(메모리에 올라가지 않은 상태) 동적 할당 -> Stack(메모리에 올라간 상태) 영역으로 이동
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	// 생성자 오버로딩.
	public Student(int studentID, String studentName, ArrayList<Subject> subjectList) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.subjectList = subjectList;
	}
	
	public void addSubject(String name, int score) {
//		Subject subject = new Subject(name, score);
		subjectList.add(new Subject(name, score));
	}
	

	
	
	public void showStudentInfo() {
		int total = 0;
		for (Subject s2 : subjectList) {
			total += s2.getScorePoint(); // 총점 더하기
			
			System.out.println("학생: " + studentName + " 의 총점은 " + total + " 입니다.");
		}
	}
	
	
	
	
	
	
}
