package ChoiceRoute;
import java.util.Scanner;// have to import scanner

public class VacationChoiceRoute {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// initiate scanner
		int choice;
		// initiate switch variable
		System.out.println("Where would you like to go on vacation");
		System.out.println("these are your options below");
		System.out.println("If you choice to go to Florida, press 1");
		System.out.println("If you choice to go to New York, press 2");
		System.out.println("If you choice to go to California, press 3");
		choice = scanner.nextInt();
		// scanner need to enable Int values
		switch (choice) { // switch operation
		case 1:
		System.out.println("Florida, You will need around $1,800.00 in order to have a good time.");
		break;
		case 2:
			System.out.println("New York, You will need around $3,000 in order to have a good time.");
		break;
		case 3:
			System.out.println("California, You will need around $3,600 in order to have a good time.");
		break;
		default:
			System.out.println("Invalid selection");
		}// scanner close
		
		System.out.println("What are the dates you would like to go?");
		System.out.println("press 1 for the March 23-26, 2024");
		System.out.println("press 2 for the April 14-17, 2024");
		System.out.println("press 3 for the June 1-5, 2024");

        choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("press 1 for the March 23-26, 2024");
		break;
		case 2:
			System.out.println("press 2 for the April 14-17, 2024");
		break;
		case 3:
			System.out.println("press 3 for the June 1-5, 2024");
		break;
		default:
			System.out.println("Invalid entry");
		}
		scanner.close();
		System.out.println("Have a great trip. \n - Luxury Travel Services, LLC");
	}
}
