import java.util.Scanner;
import java.util.Random;
public class RPSSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); //Set up keyboard for input
		System.out.println("Welcome to Rock, Paper, Scissors! Best 2 out of 3!");
		
		boolean isPlaying = true; //boolean for while loop
		int playerWins = 0; //Total player wins
		int computerWins = 0; //Total comp wins
		int gameCount = 0; //Total games played
		
		while(isPlaying = true)
		{
			System.out.println("Enter \"Rock\", \"Paper\", or \"Scissors\""); //Prompt user for input
			String choice = keyboard.nextLine(); //User input
			
			Random r = new Random();
			int computerChoiceInt = r.nextInt(3); //Chooses a random value between 0 (inclusive) and 3 (exclusive)
			
			/*Rock = 0; Paper = 1; Scissors = 2 for Computer
			 *Player choice is 1st, Comp choice is 2nd*/
			if(choice.equalsIgnoreCase("Rock") && computerChoiceInt == 0) //Rock v. Rock
			{
				System.out.println("Rock v. Rock: Tie!");
				gameCount++; //Increment Game count
				System.out.println("Player has won "+playerWins+" times, Computer has won "+computerWins+" times");
			}
			else if(choice.equalsIgnoreCase("Rock") && computerChoiceInt == 1) //Rock v. Paper
			{
				System.out.println("Rock v. Paper: Computer Wins!");
				computerWins++; //Increment Comp wins
				gameCount++; //Increment Game count
				System.out.println("Player has won "+playerWins+" times, Computer has won "+computerWins+" times");
			}
			else if(choice.equalsIgnoreCase("Rock") && computerChoiceInt == 2) //Rock v. Scissors
			{
				System.out.println("Rock v. Scissors: Player Wins!");
				playerWins++; //Increment Player wins
				gameCount++; //Increment Game count
				System.out.println("Player has won "+playerWins+" times, Computer has won "+computerWins+" times");
			}
			else if(choice.equalsIgnoreCase("Paper") && computerChoiceInt == 0) //Paper v. Rock
			{
				System.out.println("Paper v. Rock: Player Wins!");
				playerWins++; //Increment Player wins
				gameCount++; //Increment Game count
				System.out.println("Player has won "+playerWins+" times, Computer has won "+computerWins+" times");
			}
			else if(choice.equalsIgnoreCase("Paper") && computerChoiceInt == 1) //Paper v. Paper
			{
				System.out.println("Paper v. Paper: Tie!");
				gameCount++; //Increment Game count
				System.out.println("Player has won "+playerWins+" times, Computer has won "+computerWins+" times");
			}
			else if(choice.equalsIgnoreCase("Paper") && computerChoiceInt == 2) //Paper v. Scissors
			{
				System.out.println("Paper v. Scissors: Computer Wins!");
				computerWins++; //Increment Comp wins
				gameCount++; //Increment Game count
				System.out.println("Player has won "+playerWins+" times, Computer has won "+computerWins+" times");
			}
			else if(choice.equalsIgnoreCase("Scissors") && computerChoiceInt == 0) //Scissors v. Rock
			{
				System.out.println("Scissors v. Rock: Computer Wins!");
				computerWins++; //Increment Comp wins
				gameCount++; //Increment Game count
				System.out.println("Player has won "+playerWins+" times, Computer has won "+computerWins+" times");
			}
			else if(choice.equalsIgnoreCase("Scissors") && computerChoiceInt == 1) //Scissors v. Paper
			{
				System.out.println("Scissors v. Paper: Player Wins!");
				playerWins++; //Increment Player wins
				gameCount++; //Increment Game Count
				System.out.println("Player has won "+playerWins+" times, Computer has won "+computerWins+" times");
			}
			else if(choice.equalsIgnoreCase("Scissors") && computerChoiceInt == 2) //Scissors v. Scissors
			{
				System.out.println("Scissors v. Scissors: Tie!");
				gameCount++; //Increment Game count
				System.out.println("Player has won "+playerWins+" times, Computer has won "+computerWins+" times");
			}
			else
			{
				System.out.println("Not a valid input! Computer Wins");
				computerWins ++; //Increment Comp wins (invalid input from user)
				gameCount ++; //Increment Game count
				System.out.println("Player has won "+playerWins+" times, Computer has won "+computerWins+" times");
			}
			
			if(gameCount == 3) //If statement to stop play when gameCount is 3
			{
				
				if(playerWins > computerWins) //If/else statement to determine who wins the entire game
				{
					System.out.println("The Player Wins!"); //Print player wins
				}
				else if(playerWins < computerWins)
				{
					System.out.println("The Computer Wins"); //Print comp wins
				}
				else if(playerWins == computerWins)
				{
					System.out.println("Tie!");
				}
				
				System.out.println("Want to play again? \"Yes\" or \"No\""); //Prompt user to enter whether they want to play again
				String answer = keyboard.nextLine(); //User answer
				
				if(answer.equalsIgnoreCase("Yes")) //If/else statement for continuing to play
				{
					gameCount = 0; //Reset the game 
					computerWins = 0;
					playerWins = 0;
					System.out.println("");
				}
				else if(answer.equalsIgnoreCase("No"))
				{
					isPlaying = false;
					System.out.println("\nGAME OVER!");
					System.exit(0); //Exit the game
					
				}
				else //
				{
					isPlaying = false;
					System.out.println("Invalid choice. \n\nGAME OVER!");
					System.exit(0); //Exit the game
				}
			}
		}
	}

}
