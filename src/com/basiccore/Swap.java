package com.basiccore;

import java.util.Scanner;

public class Swap {
	
	public static void swapMethod() {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");int a = sc.nextInt();
		System.out.print("b = ");int b = sc.nextInt();
		sc.close();
		
		System.out.println("Before Swapping a = "+a+" "+" b = "+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping a = "+a+" "+" b = "+b);
	}

}
