/*
 * Written by Warren Beagle
 */
import java.util.Scanner;
public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); //Set up keyboard using the Scanner
		System.out.println("Welcome to the MLB GM Simulator. "
				+ "\nYou are going to make decisions that ever Major League GM has to make on a daily basis."); //Print line
		System.out.println("Welcome to an MLB Front Office."
				+ "\nWe need a new ticket price. What do you want to set the price of tickets to for the upcoming season? (int)"); //Prompt user for ticket price
		int price = keyboard.nextInt(); //Input ticket price
		if(price < 50) //if/else statement for ticket price; numeric comparison
		{
			System.out.println("The fans will be happy that the new ticket prices are so low."
					+ "\nThe team isn't doing so well though. How should we handle this: \"Restructure\" or \"Continue\"?"); //Prompt user for input
			Scanner keyboard2 = new Scanner(System.in); //Set up keyboard using the Scanner
			String answer = keyboard2.nextLine(); //Input selection
			if(answer.equalsIgnoreCase("Restructure")) //if/else statement for selection; string comparison
			{
				System.out.println("How should we do this: \"Fire the Manager\" or \"Trades\"?"); //Prompt user for solution
				Scanner keyboard3 = new Scanner(System.in); //Set up keyboard using the Scanner
				String restructuring = keyboard3.nextLine(); //Input solution
				if(restructuring.equalsIgnoreCase("Fire the Manager")) //if/else statement for solution; string comparison
				{
					System.out.println("You now need to find a new manager to lead us to a World Series."); //Print result (1)
					System.exit(0); //Exit Program
				}
				else if(restructuring.equalsIgnoreCase("Trades"))
				{
					System.out.println("These new players in the clubhouse could spark a chase for the penant."); //Print result (2)
					System.exit(0); //Exit program
				}
				else
				{
					System.out.println("I guess you are happy with losing. You're fired!"); //Print result (3)
					System.exit(0); //Exit program
				}
			}
			else if(answer.equalsIgnoreCase("Continue"))
			{
				System.out.println("If the team does not begin to succeed, your job may be in jeopardy."
						+ "\nOur star first baseman needs a new contract though. How many more years should we sign him for? (int)"); //Prompt user for #ofYears
				Scanner keyboard4= new Scanner(System.in); //Set up keyboard using the Scanner
				int signing = keyboard4.nextInt(); //Input for signing years
				if(signing > 10) //if/else statement for signing years; numeric comparison
				{
					System.out.println("He will now be a part of our organization until he retires."); //Print result (4)
					System.exit(0); //Exit program
				}
				else
				{
					System.out.println("We need to make sure he stays here after this new contract expires."); //Print result (5)
					System.exit(0); //Exit program
				}
			}
			else
			{
				System.out.println("We need somebody who will make decisions. You're fired!"); //Print result (6)
				System.exit(0); //Exit program
			}
		}
		else
		{
			System.out.println("The fans aren't going to be happy with the higher prices. But we now have extra money. "
					+ "\nHow do you want to allocate this: \"Renovations\" or \"Experiences\"?"); //Prompt user for allocation
			Scanner keyboard5 = new Scanner(System.in); //Set up keyboard using the Scanner
			String allocation = keyboard5.nextLine(); //Input allocation
			if(allocation.equalsIgnoreCase("Renovations") || allocation.equalsIgnoreCase("Experiences"))
			{	
				System.out.println("How much money do you want to put in to "+allocation+". (int)"); //Prompt user for amount to allocate
				Scanner keyboard6 = new Scanner(System.in); //Set up keyboard using the Scanner
				int amount = keyboard6.nextInt(); //Input allocation amount
				if(allocation.equalsIgnoreCase("Renovations") && amount >= 1000000) //if/else statement for allocation; compound boolean expression
				{
					System.out.println("The \"new look\" stadium is going to be really nice in the coming years."); //Print result (7)
					System.exit(0); //Exit program
				}
				else if(allocation.equalsIgnoreCase("Renovations") && amount < 1000000)
				{
					System.out.println("I think the fans will like the new minor renovations."
							+ "\nWhere should these minor renovations occur: \"Concessions\" or \"Restrooms\"?"); //Prompt user for where to allocate funds
					Scanner keyboard7 = new Scanner(System.in); //Set up keyboard using the Scanner
					String renovations = keyboard7.nextLine(); //Input where to allocate
					if(renovations.equalsIgnoreCase("Concessions")) //if/else statement for where to allocate; string comparison
					{
						System.out.println("The improvement to the concessions will really benefit the fans."); //Print result (8)
						System.exit(0); //Exit program
					}
					else if(renovations.equalsIgnoreCase("Restrooms"))
					{
						System.out.println("The new restrooms will enhance the fan experience at the ball park."); //Print result (9)
						System.exit(0); //Exit program
					}
					else
					{
						System.out.println("You aren't very good at making decisions for the organization. You're fired."); //Print result (10)
						System.exit(0); //Exit program
					}
				}
				else if(allocation.equalsIgnoreCase("Experiences") && amount >=1000)
				{
					System.out.println("These new fan experiences will really enhance the game and fan experience."
							+ "\nShould we have \"Promotions\" or \"Giveaways\" for the fans?"); //Prompt user for experience
					Scanner keyboard8 = new Scanner(System.in); //Set up keyboard using the Scanner
					String experiences = keyboard8.nextLine(); //Input experience
					if(experiences.equalsIgnoreCase("Promotions")) //if/else statement for experience; string comparison
					{
						System.out.println("The new in-game promotions will really help with keeping butts in seats during games."); //Print result (11)
						System.exit(0); //Exit program
					}
					else if(experiences.equalsIgnoreCase("Giveaways"))
					{
						System.out.println("The new giveaways at different games will help with ticket sales."); //Print result (12)
						System.exit(0); //Exit program
					}
					else
					{
						System.out.println("I think it may be time for you to step down if you are not looking out for the fans."); //Print result (13)
						System.exit(0); //Exit program
					}		
				}
				else if(allocation.equalsIgnoreCase("Experiences") && amount < 1000)
				{
					System.out.println("I like the idea of keeping the experience the same with some minor additions."); //Print result (14)
					System.exit(0); //Exit program
				}
			}
			else
			{
				System.out.println("If you can't make these decisions, it might be time for you to find a new job."); //Print result (15)
				System.exit(0); //Exit program
			}
		}
	}
}

