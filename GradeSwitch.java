package GradeSwitch;

import java.util.Scanner;

public class GradeSwitch {

	public static void main(String[]args) {
		System.out.println("This is the grading scale using switch");
		Scanner gradeScanner = new Scanner(System.in);
	
		int grades = gradeScanner.nextInt();
		switch (grades) {
		case 1:
			System.out.println("You have a A");
			break;
		case 2:
			System.out.println("You have a B");
			break;
		case 3:
			System.out.println("You have a C");
			break;
		case 4:
			System.out.println("You have a D");
			break;
		case 5:
			System.out.println("You have a E");
			break;
		}
		
		
//		int [] aI = {0,1,2,3,4,5,6};
//		int[] aI2= new int[10];
//		copying elements to another array
////		System.arraycopy(aI,  0,  aI2,  4, aI.length);
//		System.out.println(aI2.length);
//		System.out.println(aI.length);
	}
}
