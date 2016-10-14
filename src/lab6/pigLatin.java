package lab6;
//import java.util.Arrays; 
import java.util.Scanner;

public class pigLatin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// header and input option
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.print("Enter a line to be translated: ");
		String word = input.nextLine();
		char [] vow = {'a', 'e', 'i', 'o', 'u'};
		char firstLetter = word.charAt(0);
		//boolean cont;
		 
		for (int x = 0; x < vow.length; x++ ){ 				
			if (firstLetter==vow[x]) { 
			System.out.println(word+"way");
 //break;
			// final output in lower case
		} else { 
			System.out.println(word);
			//continue;
		} 
	//System.out.println(firstLetter);
	}
	}
}
