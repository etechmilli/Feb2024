package FoodMenu;
import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {
		System.out.println("Welcome to the HotPot restaurant");
		System.out.println("Would you like a Turkey hot pot enter 1");
		System.out.println("Would you like a Beef hot pot enter 2");
		System.out.println("Would you like a Ham hot pot enter 3");
		
		Scanner scanner = new Scanner(System.in);
		
		int choice = scanner.nextInt();

		switch(choice) {
		case 1: 
			System.out.println("Turkey hot pot");
			break;
		case 2: 
			System.out.println("Beef hot pot");
			break;
		case 3:
			System.out.println("Ham hot pot");
			break;
		default:
			System.out.println("Invalid order, try again");
		break;
		}
		scanner.close();
		
		}
	}

