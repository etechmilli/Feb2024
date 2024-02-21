package ArrayFun;

import java.util.Scanner;

public class ArrayFun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] someValues = new int[5];
		
		for(int i = 0; i < someValues.length; i++) {
			System.out.print("enter integer value here:\t");
			someValues[i] = sc.nextInt();
		}//end for
		
		for(int i = 0; i < someValues.length; i++) {
//			int result = someValues[i] * 2;
			System.out.println("Result is " + someValues[i] * 2);
	}//end for
	}
}
