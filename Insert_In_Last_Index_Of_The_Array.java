package com.ArrayOperations;

import java.util.Scanner;

public class Insert_In_Last_Index_Of_The_Array {
	
	static int count = 0 , position ;

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
		
		for(int i = o;i<ar.length;i++)
		{
		System.out.println("Array elements are :"+ar[i]);
		}
		System.out.println("Enter element Which You want to insert in the last of the array");
		int t = sc.nextInt();
		System.out.println("Enter a position where you want to insert");
		int position = sc.nextInt();
		sc.close();
		for(int i= ar.length-1; i>position; i--)
		{
			ar[i] = ar[i-1];
		
		}
		ar[position] = t;
		for(int i : ar) {
		System.out.println("Array elements are :"+i);
		}
	}

}
