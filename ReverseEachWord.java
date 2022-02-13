package com.date7Feb;

import java.util.Arrays;



/*
 public static void main(String[] args) {
		String str = "the sky is blue";
		System.out.println("The original string is: " + str);
		String strWords[] = str.split("\\s");
		String rev = "";
		for(String sw : strWords) {
		StringBuilder sb = new StringBuilder(sw);
		sb.reverse();
		rev += sb.toString() + " ";
		}
		System.out.println("The modified string is: " + rev.trim());
		
		 }  
 */

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name={"Deepak", "kumar", "gupta"};
		
		for(int i=0;i<name.length/2;i++)
		{
			String temp=name[i];
			name[i]=name[name.length-i-1];
			name[name.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(name));
	}

}
