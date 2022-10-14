package com.recepkabakci;

import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

	public static void main(String[] args) {
		try {
		Scanner scanner= new Scanner(System.in);
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		System.out.println(x/y);
		}catch (java.util.InputMismatchException ime) {
            System.out.println("java.util.InputMismatchException");
        } catch (java.lang.ArithmeticException ae) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }        
	}

}
