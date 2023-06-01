package com.seojava.arraytest;

public class ArrayTest {
	public static void main(String[] args) {
		int a = 10;
		int[] studentIds = new int[] {100,101,102,103,104,105};
		int[] ids = {1, 2, 3, 4, 5}; 
		int[] num; //배열객체 선언.
		num = new int[5]; // 배열 객체 인스턴스 생성(인스턴스 화)
		int sum = 0;
		int minus = 0;
		
		for (int i = 0; i < studentIds.length; i++) {
			if (studentIds[i] % 2 == 0) {
				sum += studentIds[i];
			}else {
				minus -= studentIds[i];
			}
		}
		
		System.out.println(sum);
		System.out.println(minus);
		
		for (int i = 0; i < num.length; i++) {
			num[i] = i+1;
			
		}
		System.out.println(num);

	
		System.out.println(sum);

		for(int id: studentIds) {
			System.out.println(studentIds);
		}
		
	}
}
