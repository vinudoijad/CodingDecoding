package com.duplicatesCharacter;

public class DuplicatesCharacter {

	public static void main(String[] args) {
		
		String str= "Vinayak";
		int count= 0;
		char [] ch = str.toCharArray();
		for(int i=0; i< ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if (ch[i]== ch[j]) {
					System.out.println("Duplicates character are :"+ ch[j]);
					count++;
				}
			}
		}

		System.out.println("Duplicates characher count is :"+ count);
	}

}
