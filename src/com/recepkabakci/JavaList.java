package com.recepkabakci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<N;i++) {
			list.add(scanner.nextInt());
		}
		int Q=scanner.nextInt();
		
		for(int i=0;i<Q;i++) {
			String query=scanner.next();
			switch(query) {
				case ("Insert"): 
					int x=scanner.nextInt();
					int y=scanner.nextInt();
					list.add(x, y);					
					break;
				case ("Delete"):{
					int z=scanner.nextInt();
					list.remove(z);		
					break;
				}			
			}
		}
		scanner.close();
		for(int x:list) {
			System.out.print(x+" ");
		}

	}

}
