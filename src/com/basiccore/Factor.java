package com.basiccore;

import java.util.Scanner;

public class Factor {
	public static void factorMethod() {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if(n<0) {
			System.out.println("Enter n greater than 0");
			System.exit(0);
		}
		
		System.out.println("Prime factors of "+n);
		
		for(int i=2;i<=n;i++) {
			while(n%i==0) {
				System.out.print(i+" ");
				n=n/i;
			}
		}
	}
}
