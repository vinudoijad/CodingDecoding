//write a program count the occurrence of words in string

package com.CharachterCount;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	
	public static void getCharCount (String name) {
		
		Map<Character, Integer> charMap= new HashMap<Character, Integer>() ;
		
		char array[] = name.toCharArray();
		//toCharArray() is a built-in function that converts a string to a sequence of characters
		
		for (char c : array) {
			
			if (charMap.containsKey(c)) {
				/*containsKey() method checks if the mapping for the specified
				key is present in the hashmap*/
				charMap.put(c, charMap.get(c)+1);
				//The get() method returns a specified element from a Map object
			}else {
				charMap.put(c, 1);
			}
		}
		System.out.println(name + " : "+ charMap);
	}

	public static void main(String[] args) {
		
		getCharCount("Vinayak");
	}
	}

 