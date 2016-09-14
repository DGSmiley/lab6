package lab6;

import java.util.Scanner;

public class pigLatin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// header and input option
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.print("Enter a line to be translated: ");
		String sentence = input.nextLine();
		
		System.out.println(sentence.toLowerCase());

	}

}
