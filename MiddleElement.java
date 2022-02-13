package com.date9Feb;

import java.util.Scanner;

public class MiddleElement {

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
		int m=0;
		if(n%2==1)
		{
			m=array[(n+1)/2-1];
		}
		else
		{
			m=(array[n/2-1]+array[n/2])/2;
		}
		
	       System.out.println("Middle element is :"+m);
	       sc.close();
	}

}
