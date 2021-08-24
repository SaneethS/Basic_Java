package com.basiccore;

import java.util.Scanner;

public class LeapYear {
	
	public static void leapYearMethod() {
		System.out.println("Enter the year:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		if(year<1000) {
			System.out.println("enter the four digit number");
		}else {
		
			if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
				System.out.println(year+" is a leap year");
			else
				System.out.println(year+" is not leap year");
		}
		
	}

}
