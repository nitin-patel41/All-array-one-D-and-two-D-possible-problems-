package com.ArrayOperations;
import java.util.*;

public class TakingSizeInRunTime {

	public static void main(String[] args) {
		
		// taking Size of array in run time 
		
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
	  }
}