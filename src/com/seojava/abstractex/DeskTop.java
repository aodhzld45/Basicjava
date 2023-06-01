package com.seojava.abstractex;

public class DeskTop extends Computer {

	// 부모 class에서 정의된 메서드 override
	@Override
	public void display() {
		System.out.println("DeskTop Class display()");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop class typing()");
	}


	
}
