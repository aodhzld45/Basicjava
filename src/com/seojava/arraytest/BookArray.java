package com.seojava.arraytest;

public class BookArray {
	public static void main(String[] args) {
		Book[] library = new Book[5]; // 객체 배열 library 참조 변수 생성.
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		library.clone();
		
		System.out.println("######################");
		
		// 인스턴스 생성후 배열에 값 저장.
		library[0] = new Book("테스트책1", "테스트글쓴이1");
		library[1] = new Book("테스트책2", "테스트글쓴이2");
		library[2] = new Book("테스트책3", "테스트글쓴이3");
		library[3] = new Book("테스트책4", "테스트글쓴이4");
		library[4] = new Book("테스트책5", "테스트글쓴이5");
		
		for (int i = 0; i < library.length; i++) { // 생성된 Book 인스턴스 멤버들 출력하는 반복문.
			library[i].showBookInfo();
		}
		
		System.out.println("복사된 copy_array 출력 ##########");
		
		Book[] copy_array = library.clone();
		
		for (int i = 0; i < copy_array.length; i++) { // 생성된 Book 인스턴스 멤버들 출력하는 반복문.
			copy_array[i].showBookInfo();
		}
		
		
		System.out.println("######################");

		
		for (int i = 0; i < library.length; i++) { // Book 인스턴스를 저장한 메모리 공간 주소.
			System.out.println(library[i]);
		}
		
		

		
	}
}
