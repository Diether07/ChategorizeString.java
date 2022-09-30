/* Chapter 8 Exercise 5 a
 * Programmer : 
 * Date : September 30, 2022
 * 
 * Write an application that accepts up to 20 Strings, or fewer if the user enters a terminating value.
 * Store each String in one of two lists—one list for short Strings that are 10 characters or fewer and 
 * another list for long Strings that are 11 characters or more. After data entry is complete, prompt the 
 * user to enter which type of String to display, and then output the correct list. For this exercise, 
 * you can assume that if the user does not request the list of short strings, the user wants the list of long strings. 
 * If a requested list has no Strings, output an appropriate message. Prompt the user continuously until a sentinel 
 * value is entered. Save the file as CategorizeStrings.java.
 * */

// This time our teacher have'nt discuss import ArrayList But show me yours and how arraylist works!
import java.util.Scanner;
public class ChategorizeString {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String[] shortString = new String[20]; //Limit is 20 Strings
	String[] longString = new String[20];

	
	System.out.println("Enter any word (type exit to terminate): ");
	//User input words
	for (int i = 0; i < 20; i++) {
		String userInput = scanner.nextLine();
		if (userInput.equals(""))
			System.out.println("Error no word detected");
		else if (userInput.equalsIgnoreCase("exit"))
			break;
		else if (userInput.length() <= 10)
			shortString[i] = userInput;
		else
			longString[i] = userInput;
	}
	
	//User which one to display
	System.out.println("What do you want to display? long String/short String: ");
	String userChoice = scanner.nextLine();
	
	if (userChoice.equalsIgnoreCase("long string")) {
		for (int i = 0; i < longString.length; i++)
			System.out.println(longString[i]);
		}
	else if (userChoice.equalsIgnoreCase("short string")) {
		for (int i = 0; i < 20; i++)
			System.out.println(shortString[i]);
	}




	
	
	}//End Main
}//End Class
