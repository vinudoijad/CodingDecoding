/*Sum of elements in Array with Java 8*/

package com.sumOfArray;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 6, 3, 7 };
		
		int sum= Arrays.stream(arr).sum();
		//Arrays.stream() this method gives sequential data
		//.sum () method addition of element
		//without Arrays.stream() sum () will not exicute
		
		System.out.println("sum of array elements is>>"+" "+sum);
	}

}
