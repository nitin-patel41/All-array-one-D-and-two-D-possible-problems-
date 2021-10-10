package com.ArrayOperations;

import java.util.Scanner;

public class Find_the_highest_elements_in_the_one_d_array {

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
		sc.close();
		
		
		for(int i = 0; i<ar.length ; i++)
		{
		System.out.println("Array elements are :"+ar[i]);
		}
		int max = ar[0];
		for(int i= 1; i< ar.length;i++)
		{
			
			if(ar[i] > max)
			max = ar[i];
		}
		
		System.out.println("highest element is :"+max);
	}

}
