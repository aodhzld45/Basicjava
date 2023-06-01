package com.seojava.test01;

import java.util.Scanner;

public class Chapter03 {

	public static void main(String[] args) {
	    Calculator cl = new Calculator();
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("첫 번째 수를 입력하세요: ");
	    cl.num1 = sc.nextInt(); // Store the input in num1
	    
	    System.out.println("두 번째 수를 입력하세요: ");
	    cl.num2 = sc.nextInt(); // Store the input in num2
	    
	    System.out.println("연산을 선택하세요:");
	    System.out.println("1. 덧셈");
	    System.out.println("2. 뺄셈");
	    System.out.println("3. 곱셈");
	    System.out.println("4. 나눗셈");
	    
	    int choice = sc.nextInt(); // Read the user's choice
	    
	    switch (choice) {
	        case 1:
	            int sum = cl.plus();
	            System.out.println("덧셈 결과: " + sum);
	            break;
	        case 2:
	            int minus = cl.minus();
	            System.out.println("뺄셈 결과: " + minus);
	            break;
	        case 3:
	            int multiply = cl.multiply();
	            System.out.println("곱셈 결과: " + multiply);
	            break;
	        case 4:
	            double divide = cl.divide();
	            System.out.println("나눗셈 결과: " + divide);
	            break;
	        default:
	            System.out.println("유효하지 않은 선택입니다.");
	    }
	    
	    sc.close(); // Close the Scanner
	}

}
