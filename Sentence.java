package com.sc;
import java.util.Scanner;
public class Sentence {

	Scanner st = new Scanner(System.in);
	
	public void PrintSentence() {
		System.out.println("Enter the sentence : ");
		String sentence = st.nextLine();
		System.out.println("Sentence : "+ sentence);
	}
}
