package com.duplicatesCharacter;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesUsingSet {
	
	int arr[] = {3,6,3,5,2,6};
	Set <Integer> dup= new HashSet <Integer>() ;
	for( int num: arr) {
		if (dup.add(num)== false) {
		
			System.out.println("Duplicates Elements are :"+ num);
		}
	}

	}
}

