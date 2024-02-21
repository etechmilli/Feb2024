package DiceSimulation;

import java.util.Random;

public class DiceSimulation {

	public static void main(String [] args) {
		
		Random random = new Random();
		int diceRoll;

		for(int i = 0; i< 10; i++) {
			diceRoll = random.nextInt(6) + 1;
			System.out.println("Dice number is " + diceRoll);
		}// end for
//		
//		diceRoll = random.nextInt(6)+1;
//		System.out.println("Dice #1 number is " + diceRoll);
//
//		diceRoll = random.nextInt(7);
//		System.out.println("Dice #2 number is " + diceRoll);
//
//		diceRoll = random.nextInt(7);
//		System.out.println("Dice #3 number is " + diceRoll);
//		
//		diceRoll = random.nextInt(7);
//		System.out.println("Dice #4 number is " + diceRoll);
//		
//		diceRoll = random.nextInt(7);
//		System.out.println("Dice #5 number is " + diceRoll);
//		
//		diceRoll = random.nextInt(7);
//		System.out.println("Dice #6 number is " + diceRoll);
//		
	}//end main
}
