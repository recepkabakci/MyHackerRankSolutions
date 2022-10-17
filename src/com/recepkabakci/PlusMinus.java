package com.recepkabakci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

	 public static void plusMinus(List<Integer> arr) {
		 DecimalFormat df = new DecimalFormat("#.#####");
		 	double countP=0;
		 	double countN=0;
		 	double countZ=0;
		 	for(int i=0;i<arr.size();i++) {
			   if(arr.get(i)>0) {
				   countP++;				   
			   }if(arr.get(i)<0) {
				   countN++;
			   }if(arr.get(i)==0) {
				   countZ++;
			   }
		   }
		 	System.out.println(df.format(countP/arr.size()));
		 	System.out.println(df.format(countN/arr.size()));
		 	System.out.println(df.format(countZ/arr.size()));
	 }
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> arr = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrTemp[i]);
	            arr.add(arrItem);
	        }

	        plusMinus(arr);

	        bufferedReader.close();
	    }
	}