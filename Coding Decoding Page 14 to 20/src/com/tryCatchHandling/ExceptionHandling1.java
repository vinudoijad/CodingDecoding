package com.tryCatchHandling;

public class ExceptionHandling1 {
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println("3");
			int i= 20/0;
		}catch (ArithmeticException e1) {
			System.out.println("4");
			e1.printStackTrace();
		}
	}

}
