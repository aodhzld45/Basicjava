package com.seojava.arraytest;

public class ObjectCopy {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		// 얕은 복사
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("==== bookArray1 ====");
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("==== bookArray2 ====");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		System.out.println("깊은 복사 #############");
		// 깊은 복사
		Book[] bookArray3 = new Book[3];
		bookArray3[0] = new Book();
		bookArray3[1] = new Book();
		bookArray3[2] = new Book();
		
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray3[i].setBookName(bookArray1[i].getBookName());
			bookArray3[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for (int i = 0; i < bookArray3.length; i++) {
			bookArray3[i].showBookInfo();
		}
		
		// 향상된 for문 사용하기
		String[] strArray = {"java", "python", "C", "javaScript", "Android"};
		
		for (String lang : strArray) {
			System.out.println(lang);
		}

	}
}