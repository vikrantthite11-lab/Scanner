package com.sc;
import java.util.Scanner;
public class Product {

	public void PriceCheck() {
	
	Scanner pd = new Scanner(System.in);
	
	System.out.println("Enter quality of the product : ");
	int a = pd.nextInt();
	System.out.println("Enter prise of the product : ");
	int b = pd.nextInt();
	System.out.println("Total prise is : "+ a*b);
}
}