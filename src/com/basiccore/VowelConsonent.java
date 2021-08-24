package com.basiccore;

import java.util.Scanner;

public class VowelConsonent {
	public static void vowelCons() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet");
		char alphabet = sc.next().charAt(0);
		sc.close();
		
		char[] array = {'a','e','i','o','u','A','E','I','O','U'};
		
		for(int i=0;i<array.length;i++) {
			if(array[i] == alphabet) {
				System.out.println(alphabet+" is an Vowel");
				System.exit(0);
			}
		}
		System.out.println(alphabet+" is a consonent.");
	}
}
