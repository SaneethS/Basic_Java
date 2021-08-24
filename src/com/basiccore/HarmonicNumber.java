package com.basiccore;

import java.util.Scanner;

public class HarmonicNumber {
	public static void harmonicNumMethod() {
		System.out.println("Enter the number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if(n<0) {
			System.out.println("Enter n greater than 0");
			System.exit(0);
		}
		
		float sum = 0 ;
		
		for(float i=1;i<=n;i++) {
			sum+=(1/i);
		}
		System.out.println("Harmonic number = "+sum);
	}
}
