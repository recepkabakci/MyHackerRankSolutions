package com.recepkabakci;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
		for (int i=0;i<n;i++) {
			int d = scanner.nextInt();
			ArrayList<Integer>list=new ArrayList<>();
			for (int j=0;j<d;j++) {
				list.add(scanner.nextInt());
				}
			mainList.add(list);
		}
		int q=scanner.nextInt();
		for (int i=0;i<q;i++) {
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			try {
				
				System.out.println(mainList.get(x-1).get(y-1));
			}catch(Exception e) {
				System.out.println("ERROR!");
			}
				
			
		}
		
		scanner.close();

	}
	

}
