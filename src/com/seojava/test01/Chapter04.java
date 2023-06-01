package com.seojava.test01;

public class Chapter04 {
	public static void main(String[] args) {
		gugudan1();
		
		System.out.println("########################################################");
		System.out.println("########################################################");
		System.out.println("########################################################");

		gugudan2();

	}
	
	public static void gugudan1() {
		int dan;		
		for(dan = 2; dan<= 9; dan++) {
			for(int i=1; i<=9; i++) {
				if (dan % 2 == 0)  // 짝수단만 출력.
				System.out.println(dan + " x " + i + " = " + dan * i);
				continue;
			}
		}
	}
	
	public static void gugudan2() {
		int dan;		
		for(dan = 2; dan<= 9; dan++) {
			for(int i=1; i<=9; i++) {
				if (dan <= i) {
					break;
				}  
				// 단보다 곱하는 수가 작거나 같은 경우까지만 출력
				System.out.println(dan + " x " + i + " = " + dan * i);
			}
		}
	}
	
	public static void star1() {
		
	}
	
	
	
	
	
	
	
	
}
