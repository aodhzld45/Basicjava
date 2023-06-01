package com.seojava.abstractex;

public class ComputerTest {
	public static void main(String[] args) {
		// 추상 class로는 객체(인스턴스)를 생성할 수 없다. 
		// -> Computer computer = new Computer();
		
//		Computer c1 = new Computer(); // 인스턴스 생성 불가 -> 추상 class로 정의
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook(); // 인스턴스 생성 불가 -> 추상 class로 정의
		Computer c4 = new MyNoteBook();
		
	}
}
