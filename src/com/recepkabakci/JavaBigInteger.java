package com.recepkabakci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String n,m;
			try {
				n = bufferedReader.readLine();
				BigInteger big = new BigInteger(n);
				m = bufferedReader.readLine();
				BigInteger big2 = new BigInteger(m);
				System.out.println(big.add(big2));
				System.out.println(big.multiply(big2));
			} catch (IOException ex) {
				
				ex.printStackTrace();
			}

	}

}
