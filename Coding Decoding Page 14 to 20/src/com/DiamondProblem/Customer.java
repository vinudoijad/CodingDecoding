package com.DiamondProblem;

public class Customer implements SBI, HDFC{

	public void message () {
		
		SBI.super.message();
		HDFC.super.message();
	}
	
	public static void main(String[] args) {
		
		Customer cos= new Customer();
		cos.message();
	}
}
