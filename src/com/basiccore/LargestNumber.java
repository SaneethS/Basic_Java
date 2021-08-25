package com.basiccore;

import java.util.Scanner;

public class LargestNumber {
	public static void largestNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		System.out.print("a = ");int a = sc.nextInt();
		System.out.print("b = ");int b = sc.nextInt();
		System.out.print("c = ");int c = sc.nextInt();
		sc.close();
		
		if(a>b && a>c)
			System.out.println(a+" is the largest");
		else if(b>c)
			System.out.println(b+" is the largest");
		else
			System.out.println(c+" is the largest");
		
	}
}
