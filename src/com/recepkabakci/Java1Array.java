package com.recepkabakci;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java1Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       String n= scan.nextLine();  
       String [] list = n.split(" ");
       for(Object li:list) {
    	   System.out.println(li);
       }
        
    }
}


