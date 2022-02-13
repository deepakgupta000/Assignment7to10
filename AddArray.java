package com.date9Feb;

import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method 
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

		 int sum = 0;  
	  
	        for (int i = 0; i < array.length; i++) {  
	           sum = sum + array[i];  
	        }  
	        System.out.println("Sum of all the elements of an array: " + sum);
	        sc.close();
	}

}
