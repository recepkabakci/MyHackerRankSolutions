package com.recepkabakci;

import java.util.Scanner;

public class JavaAnagram {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}
	static boolean isAnagram(String a, String b) {
	       if (a.length() != b.length()) {
	            return false;
	        }
	        a = a.toLowerCase();
	        b = b.toLowerCase();
	        
	        for (int i = 0; i < b.length(); i++) {
	            a = a.replaceFirst(String.valueOf(b.charAt(i)), "");
	        }

	        return a.isEmpty() ? true : false;
	        
	        
	    }

}
