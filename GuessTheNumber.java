package GuessTheNumber;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
	
		Random randomGenerator = new Random();
		Scanner sc = new Scanner(System.in);
		int choice;
		int targetNumber = randomGenerator.nextInt(100) + 1; // Generate a random number between 1 and 100
		int numberGuesses = 0; // Counter to keep track of the number of guesses
				
		do {
			System.out.print("Select a number between 1-100: ");
			choice = sc.nextInt();
			numberGuesses++; // Increment the number of guesses
		
		if (choice > targetNumber) {
			System.out.println("Your guess was too high");	
		}
		else if(choice < targetNumber){
			System.out.println("Your guess was too low");	
		}
		else if(choice == targetNumber){
			System.out.println("Congratulations! You guessed the numer in " + numberGuesses + " guesses! Thank you for playing");	
		}
		else if(choice <= 0 || choice >= 101){
			System.out.println("Your guess is out of range 1 through 100, inclusive");	
		}
	} while (choice != targetNumber); // Repeat until the correct number is guessed
	
	sc.close(); // Close the scanner

	}// end main

}
