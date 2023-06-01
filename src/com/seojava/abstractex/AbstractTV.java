package com.seojava.abstractex;

// 모든 추상 메서드를 구현한 클래스. -> 상속만을 위해 구현하여 NEW 에약어로 인스턴스 생성이 불가.
public abstract class AbstractTV {
	
	public void display() {
		System.out.println("DeskTop Class display()");
		
	}

	public void typing() {
		System.out.println("DeskTop class typing()");
	}
}
