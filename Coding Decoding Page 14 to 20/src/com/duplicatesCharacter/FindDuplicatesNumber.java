package com.duplicatesCharacter;

public class FindDuplicatesNumber {

	public static void main(String[] args) {
		System.out.println("duplicate number ");
		int[] a = { 4, 6, 2, 4, 6, 1, 7, 5, 6, 2 };
		for (int i=0; i<a.length-1; i++) {
			for (int j=i+1; j<a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println("Duplicates Elements Are :"+ a[j]);
				}
			}
		}

	}

}
