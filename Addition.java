package com.sc;
import java.util.Scanner;
public class Addition {
		
		Scanner ad = new Scanner(System.in);
		
		public void addNumber() {
			int a = 0;
			int b = 0;
		
	    System.out.println("Addition of Numbers: ");
		System.out.println("Enter first number: ");
		a = ad.nextInt();
		
		System.out.println("Enter Second number: ");
		b = ad.nextInt();
		
		int c = a + b;
		System.out.println("Addition = " + c);
	}
}
