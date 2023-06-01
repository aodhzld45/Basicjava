package com.seojava.test01;

import java.util.Scanner;

public class HelloJava {
	public static void main(String[] args) {
//		int(정수형) - 4byte / 8bit로 표현.
		int num = 10;
		int bnum = 0B1010;
		int oNum = 012;
		int hNum = 0xA;
		
		int test = 0;

//		Scanner sc = new Scanner(System.in);
//		sc.nextInt();
//		
		System.out.println(test);
		
		System.out.println(num);
		System.out.println(bnum);
		System.out.println(oNum);
		System.out.println(hNum);
		
		long n1 = 1234567890; // 정수 리터럴 -> 기본적으로 int값을 가지고 있음 더 큰 자료형인 long으로 변경.
			
		float fl = 0.2F;
		double db = 0.3;
		double db2 = 0.7;
		
		double sum = fl + db;
		
		double sum2 = db + db2;

		
		System.out.println(sum);
		System.out.println(sum2);

		
		if (fl + db == 0.5) {
			System.out.println("연산됨");
			System.out.println("fl = " + fl);
			System.out.println("db = " + db);
		}else {
			System.out.println("연산되지 않음.");
			System.out.println("fl = " + fl);
			System.out.println("db = " + db);
		}
		
		System.out.println(n1);
	
		
//		############################################################################
//		부동 소수형 방식의 오류
		double dnum = 1;
		
		for (int i = 0; i < 10000; i++) {
			dnum += 0.1;
		}
		System.out.println(dnum);

		
	}
}