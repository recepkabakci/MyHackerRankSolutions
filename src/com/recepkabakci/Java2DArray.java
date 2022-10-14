package com.recepkabakci;

import java.util.Scanner;

public class Java2DArray {

	public static void main(String[] args) {
		 int x[][] = new int[6][6];
	        int maxSum = Integer.MIN_VALUE;
	        try (Scanner scanner = new Scanner(System.in);){
	            for(int i = 0; i < 6; i++){
	                for(int j = 0; j < 6; j++){
	                    x[i][j] = scanner.nextInt();
	                    if (i > 1 && j > 1){
	                        int sum = x[i][j] + x[i][j-1]+ x[i][j-2]
	                            + x[i-1][j-1]
	                            + x[i-2][j]+ x[i-2][j-1] + x[i-2][j-2];
	                        if (sum > maxSum) {
	                            maxSum = sum;
	                        }
	                    }
	                }
	            }
	        }
	        System.out.println(maxSum);

	}

}
