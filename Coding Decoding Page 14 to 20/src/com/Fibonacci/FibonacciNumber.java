package com.Fibonacci;

import java.util.Scanner;

public class FibonacciNumber {
	
	public void fibonumber(int a) {
		
		int fiboF=0;
		int fiboS=1;
		int fiboN=0;
		
		for(int i=0; i<=a; i++) {
		
		fiboF=fiboS;
		fiboS=fiboN;
		fiboN=fiboF+fiboS;
		System.out.println("Fibo>>"+fiboS);
		}
		
	}


	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no");
		int z=scanner.nextInt();
		
		 FibonacciNumber  fibo= new FibonacciNumber();
		 fibo.fibonumber(z);
		
	}

}
