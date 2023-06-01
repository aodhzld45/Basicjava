package com.seojava.string;


public class StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("Java");
		
		System.out.println("javaStr 문자열 주소 = " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		
		System.out.println("연산전 buffer 메모리 주소 = " + System.identityHashCode(buffer));

		buffer.append("and");
		buffer.append("and2");
		buffer.append("and3");
		
		System.out.println(buffer);

		
		System.out.println("연산 후 buffer 메모리 주소 = " + System.identityHashCode(buffer));

	}
}
