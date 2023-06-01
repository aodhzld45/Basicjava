package com.seojava.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
	
	public class Person{
		String name;
		int age;
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		//forName - jdbc Driver java : DB 연동시 사용.
		Class strClass = Class.forName("java.lang.String");
		
		//Person person = new Person();
		
		Class<?> pclass2 = Class.forName("classex.Person");
		
//		Person person2 = pclass2.newInstance();
		
		
		
		Constructor[] cons = strClass.getConstructors();
		
		for (Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println();
		
		Field[] fields = strClass.getFields();
		
		for (Field f : fields) {
			System.out.println(f);
		}
		System.out.println();
		
		Method[] methods = strClass.getMethods();
		
		for (Method m : methods) {
			System.out.println(m);
		}
		
		
	}
}
