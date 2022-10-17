package com.recepkabakci;

import java.time.format.DateTimeFormatter;

public class TimeConversion {

	public static void main(String[] args) {
		System.out.println(timeConversion("12:12:00AM"));

	}
	public static String timeConversion(String s) {
		
		int hour = Integer.parseInt(s.substring(0, 2)) % 12;
		  
		if (s.endsWith("PM"))
	        hour += 12;
	    return String.format("%02d", hour) + s.substring(2, 8);

    }

}
