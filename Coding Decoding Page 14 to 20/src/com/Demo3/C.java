package com.Demo3;

public class C extends A{
	
	public void m1() {
		System.out.println("C -m1");
	}

	public static void main(String[] args) {
		
	    A a= new C();
		a.m1();
		
		a= new A();
		a.m1();
		
		a= new B();
		a.m1();
	}
}
