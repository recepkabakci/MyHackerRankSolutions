package com.recepkabakci;

public class Printer {

	public static <E> void printArray(E[] inputArray) {
		
		for (E element : inputArray){
			System.out.println(element);
		}
	}	    

}
