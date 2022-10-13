package com.recepkabakci;

public class Printer {

	public static <T> void printArray(T[] inputArray) {
		
		for (T element : inputArray){
			System.out.println(element);
		}
	}	    

}
