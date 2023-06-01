package com.seojava.hiding;

public class Student {
	// 멤버 변수 (인스턴스 변수)
	// 접근 제어자 캡슐화 - 정보 은닉.	
	// 책 p - 167 접근제어자 표 참고.
	public int studentId; // 학번
	private String studentName; // 학생 이름 - 특정한 method를 통해서만 접근을 한다. / 같은 클래스 내에서만 접근이 가능.
	int grade; // default 접근제어자.
	protected String address; // 주소
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName + "님";
	}
	

}
