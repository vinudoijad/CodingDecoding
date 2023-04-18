package com.tryCatchHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("1");
			int i= 10/0;
			
		}catch (NullPointerException e) {
			System.out.println("2");
			
		}
	}
}
