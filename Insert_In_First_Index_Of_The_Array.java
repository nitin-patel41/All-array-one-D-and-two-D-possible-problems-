package com.ArrayOperations;

import java.util.Scanner;

public class Insert_In_First_Index_Of_The_Array {

	public static void main(String[] args) {
		
		// Insert element into the first index of the array
		
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
		
		}
	     
		System.out.println("Enter the element Which You want To insert into then first index");
		int t = sc.nextInt();
		sc.close();
		
		for(int i = ar.length; i>0; i--)
		{
			
				ar[i] = ar[i-1];
		}
		ar[0] = t;
		System.out.println("Array With the New element: " +ar[i]);
		
	}

}
