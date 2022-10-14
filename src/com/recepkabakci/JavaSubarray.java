package com.recepkabakci;

import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n= scanner.nextInt();
		int[] array=new int[n];
			for(int i=0;i<n;i++) {
				array[i]=scanner.nextInt();		
		}
		int count=0;
		for(int j=0;j<n;j++){
	        int sum=0;
	        for(int k=j;k<n;k++){
	            sum=array[k]+sum;
	            if(sum<0){
	                count++;
	            }
	        }
	    }
	    System.out.println(count);
	    scanner.close();

	}

}
