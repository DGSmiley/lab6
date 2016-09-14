package lab6;

import java.util.Scanner;

public class pigLatin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// header and input option
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.print("Enter a line to be translated: ");
		String sentence = input.nextLine();
		char [] vol = {'a', 'e', 'i', 'o', 'u'};
		char firstLetter = sentence.charAt(0);

		/*if (firstLetter.eqauls(vol)) {
			System.out.println("sent");

			// final output in lower case
		} else {
			System.out.println(sentence.toLowerCase());
		} */
	}
}
