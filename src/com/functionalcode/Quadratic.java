package com.functionalcode;

import java.util.Scanner;

public class Quadratic {
	public static void quadratic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coeffiecients: ");
		System.out.print("a = ");double a = sc.nextDouble();
		System.out.print("b = ");double b = sc.nextDouble();
		System.out.print("c = ");double c = sc.nextDouble();
		sc.close();
		
		double delta = (b*b) - (4*a*c);
		double root1 = (-b+Math.sqrt(delta))/2*a;
		double root2 = (-b-Math.sqrt(delta))/2*a;
		
		System.out.println("Roots of x");
		System.out.println("Root1 = "+root1);
		System.out.println("Root2 = "+root2);
	}
}
