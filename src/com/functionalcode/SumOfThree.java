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
		sum(n,array);
	}
	
	public static void sum(int n, int[] a) {
		boolean flag = false;
		int count = 0;
		for(int i=0;i<n-2;i++)
			for(int j=i+1;j<n-1;j++)
				for(int k=j+1;k<n;k++) {
					if(a[i]+a[j]+a[k]==0) {
						count++;
						System.out.println("The triples are ("+a[i]+","+a[j]+","+a[k]+")");
						flag = true; 
					}
				}
		if(flag == false) {
			System.out.println("Triples not found");
		}
		System.out.println("total number of triples : "+count);
	}
}
