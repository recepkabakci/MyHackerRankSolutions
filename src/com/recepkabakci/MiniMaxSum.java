package com.recepkabakci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
	 public static void miniMax(List<Integer> arr) {
	       Collections.sort(arr);
	       int temp=0;
	       for(int i=0;i<arr.size();i++) {
	    	   temp+=arr.get(i);
	       }
	       System.out.println(temp-arr.get(4) + " "+ (temp-arr.get(0)));
	 }
	 public static void main(String[] args) {
		 List<Integer> arr = new ArrayList<>();
		 arr.add(2);
		 arr.add(3);
		 arr.add(2);
		 arr.add(1);
		 arr.add(10);
		 miniMax(arr);
	}


}
