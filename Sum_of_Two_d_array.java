package com.ArrayOperations;

import java.util.Scanner;

public class Sum_of_Two_d_array {
	static int sum = 0;

	public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Size of the array");
		int f = sc.nextInt();
		System.out.println("Enter the Second Size of the array");
	    int s = sc.nextInt();
		
	    System.out.println("Enter the elements of the array");
		int [][] ar  = new int[f][s];
		
		for(int i= 0;i<f;i++)
		{
	
			for(int j= 0;j<s;j++)
		    {
			ar[i][j] = sc.nextInt();
			}
			System.out.println();
			
		}
		sc.close();
		System.out.println("Elements Are");
		for(int i= 0;i<f;i++)
		{
			for(int j= 0;j<s;j++)
			{
				System.out.print(ar[i][j] + " ");
				sum = sum + ar[i][j];
			}
			System.out.println();
		    System.out.println("sum of two d array is :"+sum);
		}
	}

}
