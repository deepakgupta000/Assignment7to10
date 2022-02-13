package com.date8Feb;

import java.util.Scanner;

public class DigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ten digits number");
	        StringBuilder sb = new StringBuilder();
	        //append;
	        String str= sc.nextLine();
	        sb.append("+91- ");
	        sb.append(str);
	        System.out.println(sb);
	}

}
