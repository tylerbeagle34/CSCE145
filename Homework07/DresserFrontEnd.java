/*
 * Written by Warren Beagle
 */
import java.util.Scanner;
public class DresserFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Clothing clothing;
		Dresser dresser = new Dresser();
		System.out.println("Welcome to the dresser");
		String input = "";
		while(input.equalsIgnoreCase("quit")!= true) //While loop that prompts user for input on what to insert/remove from the dresser
		{
			clothing = new Clothing();
			System.out.println("\nWhat would you like to do?\n" +
					"Enter 1: To add an item\n" +
					"Enter 2: To remove an item\n" +
					"Enter 3: To print out the dresser contents\n" +
					"Enter 9: To quit\n");
			int choice = keyboard.nextInt();
			keyboard.nextLine();
			switch(choice)
			{
			case 1: //Add item of clothing
				System.out.println("Enter the type. \nIt may be undergarment, socks, stockings, top, bottom, or cape");
				clothing.setType(keyboard.nextLine());
				System.out.println("Enter the color. \nIt may be brown, red, pink, orange, green, blue, purple, or grey");
				clothing.setColor(keyboard.nextLine());
				dresser.add(clothing); //Add method
				break;
			case 2: //Remove item of clothing
				System.out.println("Enter the type. \nIt may be undergarment, socks, stockings, top, bottom, or cape");
				clothing.setType(keyboard.nextLine());
				System.out.println("Enter the color. \nIt may be brown, pink, orange, green, blue, purple, or grey");
				clothing.setColor(keyboard.nextLine());
				dresser.remove(clothing.getType(), clothing.getColor()); //Remove method
				break; 
			case 3: //Print clothing
				dresser.print(); //Print method
				break;
			case 9: //Quit
				input = "quit";
				break;
			}
		}
	}

}
