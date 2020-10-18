/*
 * Written by Warren Beagle
 */
public class AppleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Apple Tester");
		
		System.out.println("\nCreating a default apple");
		Apple apple01 = new Apple ();
		System.out.println("Printing the default apple's values");
		System.out.println(apple01); //Print the default values
		
		System.out.println("\nCreating another apple");
		Apple apple02 = new Apple ("Granny Smith", 0.75, 0.99);
		System.out.println("Setting the apple's values to the following valid values \"Granny Smith\", 0.75, and 0.99");
		System.out.println("Printing the new apple's values");
		System.out.println(apple02); //Print the new values
		
		System.out.println("\nCreating another apple");
		System.out.println("Setting the new apple’s values to the following invalid values \"iPad\", 2.5, and -200");
		Apple apple03 = new Apple ("iPad", 2.5, -200);
		System.out.println("Printing the apple’s values which should have not changed from the default values");
		System.out.println(apple03); //Print the values
	}

}
