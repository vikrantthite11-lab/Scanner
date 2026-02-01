package com.sc;
import java.util.Scanner;
public class Info {

		
		Scanner sc = new Scanner(System.in);
		public void info() {
		System.out.println("Enter Your Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
