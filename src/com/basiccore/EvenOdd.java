package com.basiccore;

import java.util.Scanner;

public class EvenOdd {
	public static void evenOdd(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		sc.close();
		
		if(n%2 == 0) {
			System.out.println(n+" is even number");
		}else
			System.out.println(n+" is odd number");
	}
}
