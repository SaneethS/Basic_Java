package com.functionalcode;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
	public static void twoDArray() {
		Scanner sc = new Scanner(System.in);
		int m,n;
		int[][] array = new int[10][10];
		System.out.println("Enter the no. of rows and columns:");
		m=sc.nextInt();
		n=sc.nextInt();
		System.out.println("Enter the array elements:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				array[i][j]=sc.nextInt();
		
		System.out.println("Outputs are written into file output.txt ");
		try {
      			PrintWriter output = new PrintWriter("output.txt");
				for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
						output.print(array[i][j]+" ");
					output.print("\n");
				}
	
	      			output.close();
	    	}catch(Exception e) {
	      			e.getStackTrace();
			}
	}
}
