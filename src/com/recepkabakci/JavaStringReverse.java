package com.recepkabakci;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		 	Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        sc.close();
	        int k=A.length();
	        boolean isPalindrome = true;
	        for(int i=0;i<k/2;i++) {
	            if(A.charAt(i)!=A.charAt(k-i-1)) {
	                isPalindrome=false;
	                break;
	            }
	        }
	        String result= (isPalindrome ? "Yes" :"No" );
	        System.out.println(result);
	        

	}

}
