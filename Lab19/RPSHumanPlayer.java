/*
 * Written by Warren Beagle
 */
import java.util.Scanner;
public class RPSHumanPlayer extends RPSPlayer{

	//Instance variables
	private Scanner keyboard;
	
	//Constructors
	public RPSHumanPlayer() //Default
	{
		this.keyboard = new Scanner(System.in);
	}
	
	//Other methods
	public void chooseGesture()
	{
		super.setGesture(keyboard.nextLine()); //Sets the human gesture to the next line input 
	}
}
