package com.functionalcode;

import java.util.Scanner;

public class SumOfThree {

	public static void sumOfThree() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements in array:");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Elements in array:");
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
	}
	
}
