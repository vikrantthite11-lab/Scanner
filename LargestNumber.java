package com.sc;
import java.util.Scanner;
public class LargestNumber {

	Scanner larNum = new Scanner(System.in);
	
	public void checkLargNum() {
		System.out.println("Find Largest Number : ");
		System.out.println("Enter the Three Number : ");
		int a = larNum.nextInt();
		int b = larNum.nextInt();
		int c = larNum.nextInt();
		
		if(a >= b && a >= c) {
			System.out.println(a + " -> is a gretest number ");
		}
		else if (b >= a && b >+ c) {
			System.out.println(b + " -> is a gretest number ");
		}
		else {
			System.out.println(c + "-> is a gretest number");
		}
	}
}
