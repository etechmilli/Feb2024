package AverageOfThree;

import java.util.Scanner;

public class AverageOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		
		
		System.out.println("please enter 3 numbers");
		System.out.println("Enter first number");
		firstNumber = sc.nextInt();
		
		System.out.println("Enter second number");
		secondNumber = sc.nextInt();

		System.out.println("Enter third number");
		thirdNumber = sc.nextInt();

		int avgThree = (((int)firstNumber + (int)secondNumber + (int)thirdNumber)/3);
		System.out.println("This is the average of your three numbers " + avgThree);
		
	
	
	}

}
