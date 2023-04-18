//Reverse string with stringBuilder.

package com.reverseStringBuilder;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s= "I Am Proud To be an Indian";
		
		StringBuilder str= new StringBuilder();
		str.append(s);
		str.reverse();
		System.out.println(str);
	}

}
