package com.sc;

public class MainScanner {

	public static void main(String[] args) {
		
		Addition ad = new Addition();
		ad.addNumber();
		System.out.println();
		
		Info us = new Info();
		us.info();
		System.out.println();
		
		Factorial ff = new Factorial();
		ff.checkFactorial();
		System.out.println();
		
		LargestNumber lar = new LargestNumber();
		lar.checkLargNum();
		
		PrimeCheck pi = new PrimeCheck();
		pi.primeCheck();
		
		Product pd = new Product();
		pd.PriceCheck();
		
		Sentence st = new Sentence();
		st.PrintSentence();
		
		}
	
}
