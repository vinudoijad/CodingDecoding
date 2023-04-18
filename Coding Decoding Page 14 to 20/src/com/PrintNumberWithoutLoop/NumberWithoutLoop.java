package com.PrintNumberWithoutLoop;

public class NumberWithoutLoop {

	public static void recursiveFun(int num) {

		if (num >=1) {
			System.out.println(num);
			recursiveFun(num-1);
		}
	}

	public static void main(String[] args) {

		recursiveFun(10);
	}

}
