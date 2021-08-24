package com.basiccore;

import java.util.Scanner;

public class QuotientRemainder {
	public static void quotientRemMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Divendend and Divisor");
		System.out.print("Dividend = ");int a = sc.nextInt();
		System.out.print("Divisor = ");int b = sc.nextInt();
		sc.close();
		
		int quotient = a/b;
		int remainder = a%b;
		
		System.out.println("Quotient = "+quotient+" "+"Remainder = "+remainder);
	}
}
