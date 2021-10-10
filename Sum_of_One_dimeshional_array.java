package com.ArrayOperations;

import java.util.Scanner;

public class Sum_of_One_dimeshional_array {
	static int sum =0;
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
	
		int n = sc.nextInt();
		
		int [] ar = new int[n];
		System.out.println("Enter Your Elements");
		for(int i = 0 ; i<n ; i++)
		{
			ar[i]= sc.nextInt();
		}
		
		for(int i = 0; i<ar.length ; i++)
		{
	    System.out.println("Array elements are :"+ar[i]);
		sum = sum + ar[i];
		}
        System.out.println("sum of the array is :"+sum);

	}

}
