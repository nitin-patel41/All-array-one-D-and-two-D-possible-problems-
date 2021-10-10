package com.ArrayOperations;
import java.util.Scanner;

public class Taking_Size_of_the_two_d_array_in_runtme {

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
			}
			System.out.println();
		}
		
	}

}
