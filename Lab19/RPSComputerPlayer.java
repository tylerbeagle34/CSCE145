/*
 * Written by Warren Beagle
 */
import java.util.Random;
public class RPSComputerPlayer extends RPSPlayer {

	//Instance variables
	private Random rand;
	
	//Constructors
	public RPSComputerPlayer() //Default
	{
		this.rand = new Random();
	}
	
	//Other methods
	public void chooseGesture()
	{
		int choice = rand.nextInt(3); //Picks number between 0 and 2 inclusive
		if(choice == 0) //Set the computer gesture
		{
			super.setGesture("rock");
		}
		else if(choice == 1)
		{
			super.setGesture("paper");
		}
		else if(choice == 2)
		{
			super.setGesture("scissors");
		}
	}
}
