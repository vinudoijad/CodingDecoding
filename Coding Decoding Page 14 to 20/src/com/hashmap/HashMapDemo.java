package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		Map<String , Integer> mp= new HashMap<String , Integer>();
		
		mp.put("one", 1);
		mp.put("two", 2);
		mp.put("one", 3);
		
		System.out.println(mp);
	}

}
