package com.date8Feb;

public class TotalVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "We are Proud to be an India";  
		 countCharacterType(str);
	}
	 static void countCharacterType(String str)
	 {
		 int vCount = 0, cCount = 0;  
	          
	        str = str.toLowerCase();  
	          
	        for(int i = 0; i < str.length(); i++) {  
	            //Checks whether a character is a vowel  
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {  
	                //Increments the vowel counter  
	                vCount++;  
	            }  
	             
	            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {    
	                //Increments the consonant counter  
	                cCount++;  
	            }  
	        }  
	        System.out.println(vCount+":"+cCount);
	 }

}
