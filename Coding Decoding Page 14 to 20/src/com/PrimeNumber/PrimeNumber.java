package com.PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {
		
		public void prime(int a) {
			
			if ((a%1==0)&&(a%2==1)) {
				System.out.println("This is a prime Number");
			}else {
				System.out.println("This is not Prime Number");
				
			}
		     
		}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int r=scanner.nextInt();
		
		PrimeNumber pr=new PrimeNumber();
		pr.prime(r);
	}

}
