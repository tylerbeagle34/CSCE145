import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {

	public static final int UPPER_NUM = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello. I'm thinking of a number between 0 and "+(UPPER_NUM-1));
		Random r = new Random();
		int secretNumber = r.nextInt(UPPER_NUM);
		
		boolean correctGuess = false;
		int guessNumber = 0;
		//Game Loop
		while(correctGuess == false)
		{
			System.out.println("Guess the number");
			guessNumber = keyboard.nextInt();
			if(guessNumber > secretNumber)
			{
				System.out.println("That's too high");
			}
			else if(guessNumber < secretNumber)
			{
				System.out.println("That's too low");
			}
			else
			{
				System.out.println("That's correct");
				correctGuess = true;
			}
		}
	}

}
