package com.date9Feb;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		 
		n=sc.nextInt();  
		
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		 
		array[i]=sc.nextInt();  
		}  
		int j = 0;
		while(j < array.length) 
		{
			if(array[j] >= 0) {
				System.out.print( array[j]);
			}
			j++;
		}
		
	       
	       sc.close();

	}

}
