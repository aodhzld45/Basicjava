package com.seojava.arraylist;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		ArrayList<Subject> subjectList = new ArrayList<Subject>();
		
//		Student studentSeo = new Student(1001, "seo", studentSeo);
		// ArrayList 생성자 파라미터 3개 
		Student studentSeo = new Student(1001, "seo", subjectList); 
		subjectList.add(new Subject("국어", 100));
		subjectList.add(new Subject("영어", 90));
		subjectList.add(new Subject("수학", 80));
		studentList.add(studentSeo);
		
		Student studentKim = new Student(1002, "kim", subjectList);
		subjectList.add(new Subject("국어", 70));
		subjectList.add(new Subject("영어", 60));
		subjectList.add(new Subject("수학", 50));
		studentList.add(studentKim);
		
		Student studentLee = new Student(1003, "Lee", subjectList);
		subjectList.add(new Subject("국어", 77));
		subjectList.add(new Subject("영어", 66));
		subjectList.add(new Subject("수학", 100));
		studentList.add(studentLee);
		

//		studentList.add(new Student(1001, "seo"));
//		
//		studentList.add(new Student(1002, "kim"));
//		
//		studentList.add(new Student(1003, "Lee"));
//		student.addSubject("국어", 100);
//		student.addSubject("국어", 100);
//
//		student.addSubject("국어", 100);

		for (Student s : studentList) {
			System.out.println("####################");
			s.showStudentInfo();
			System.out.println("####################");

		}
		
		
//		Student studentSeo = new Student(1001, "seo");
//		
//		studentSeo.addSubject("국어", 70);
//		studentSeo.addSubject("수학", 50);
//		
//		Student studentKim = new Student(1002, "kim");
//		
//		studentKim.addSubject("국어", 70);
//		studentKim.addSubject("영어", 100);
//		studentKim.addSubject("수학", 50);
//		
//		Student studentLee = new Student(1003, "Lee");
//		
//		studentLee.addSubject("국어", 70);
//		studentLee.addSubject("영어", 100);
//		studentLee.addSubject("수학", 50);
//		studentLee.addSubject("과학", 80);

//		student.showStudentInfo();
//		System.out.println("#################");
//		studentKim.showStudentInfo();
//		System.out.println("#################");
//		studentLee.showStudentInfo();
		

		System.out.println("######### student ArrayList");
		
				
		

		
		

	}
}
