package com.seojava.singleton;

import java.util.Calendar;
import java.util.Date;

public class CompanyTest {
	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println("호출된 두 변수의 주소의 참 거짓 유무는 " + (myCompany1 == myCompany2) + " 입니다.");

		Date date1 = new Date();
		Date date2 = new Date();

		System.out.println(date1.getYear() + 1900);
		System.out.println(date1.getMonth() + 1);
		System.out.println(date1.getDate());
		
		System.out.println(date1.getHours());
		System.out.println(date1.getMinutes());
		System.out.println(date1.getSeconds());
		
		System.out.println("################");
		
		System.out.println(date1.getTime());
		System.out.println(date1 == date2);
		
		System.out.println("################");
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		System.out.println(cal1.get(Calendar.YEAR));
		System.out.println(cal2.get(Calendar.MONTH)+1);
		System.out.println(cal2.get(Calendar.DATE));
		
		System.out.println(cal1 == cal2);


		
	}
}
