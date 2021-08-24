package com.basiccore;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	public static void flipCoinMethod() {
		double head = 0.0 , tail = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the times the coin flipped:");
		int n=sc.nextInt();
		sc.close();
		
		Random random = new Random();
		
		for(int i=0;i<n;i++) {
			float res = random.nextFloat();
			if(res < 0.5)
				tail++;
			else
				head++;
			
		}
		double headperc = (head/n)*100;
		double tailperc = (tail/n)*100;
		
		System.out.println("Percentage of head : "+headperc+"%");
		System.out.println("Percentage of tail : "+tailperc+"%");
	}
}
