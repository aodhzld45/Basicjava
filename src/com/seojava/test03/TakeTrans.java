package com.seojava.test03;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentSeo = new Student("Seo", 5000);
		Student studentKim = new Student("Kim", 10000);
		
		studentSeo.seialNum++;
		System.out.println(studentSeo.seialNum);
		System.out.println(studentKim.seialNum);
		System.out.println(Student.seialNum);
		
		
		
		
		Bus bus100 = new Bus(100);  // 노선 번호가 100인 생성자 Bus 생성(호출)
		studentSeo.takeBus(bus100); // Seo가 100번 버스를 탐
		studentSeo.showInfo();      // Seo의 정보 출력
		bus100.showInfo();			// 버스 정보 출력	
		
		System.out.println("#######################");
		
		Subway subwayGreen = new Subway("2호선"); // 노선 번호가 2호선인 지하철 생성(호출)
		studentKim.takeSubway(subwayGreen);		// Kim이 2호선 지하철을 탐.
		studentKim.showInfo();					// Kim의 정보 출력.
		subwayGreen.showInfo();					// 지하철 정보 출력.
		
	}
}
