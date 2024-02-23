package CompareStrings;

public class CompareStrings {

	public static void main(String[] args) {
	
		//The first string is compared value to the rest
		String name = "Elvis Presley";
		String name2 = "Toni Braxton";
		String name3 = "Michael Jackson";
		String name4 = "James Brown";
		
		
		System.out.println("Comparing the name of " + name + "to the rest of the list of name in value(<,>, =).\n\n");
		for(int i=0; i < name.length(); i++) {
			System.out.print(name.charAt(i));
		}//end for
		
		System.out.println();
		
		
		// comparing 1 to 2
		System.out.println("Comapring " + name + " name to " + name2 + " name values");
		if(name.equals(name2)) {
			System.out.println("Names are equal.");
		}
		else {
			System.out.println("Names are not equal");
		}
		if(name.compareTo(name2) > 0) {
			System.out.println(name + " > " + name2 );
		}
		else {
			System.out.println(name + " < " + name2 );
		}
		System.out.println("Comapring " + name + " to " + name2 + "\n\n");

		
		// comparing 1 to 3
		System.out.println("Comapring " + name + " name to " + name3 + " name values");
		if(name.equals(name3)) {
			System.out.println("Names are equal.");
		}
		else {
			System.out.println("Names are not equal");
		}
		if(name.compareTo(name3) > 0) {
			System.out.println(name + " > " + name3 );
		}
		else {
			System.out.println(name + " < " + name3 );
		}
		System.out.println("Comapring " + name + " to " + name3 + "\n\n");

		
		// comparing 1 to 4
		System.out.println("Comapring " + name + " name to " + name4 + " name values");
		if(name.equals(name4)) {
			System.out.println("Names are equal.");
		}
		else {
			System.out.println("Names are not equal");
		}
		if(name.compareTo(name4) > 0) {
			System.out.println(name + " > " + name4 );
		}
		else {
			System.out.println(name + " < " + name4 + "\n\n");
		}
		System.out.println("These are the following names that we are comparing " + name + ", " + name2 + ", " + name3 + " and " + name4 + ".");
	}

}
