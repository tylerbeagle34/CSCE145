import java.util.Scanner;
public class Closest {

	public static final double ACTUAL_PRICE = 5.99;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Here's a copy of ShaqFu. Guess the price closest.");
		
		double[] prices = new double[10];
		
		//populate the array
		for(int i = 0; i < prices.length; i++)
		{
			System.out.println("What is your guess Contestant"+i);
			double newPrice = keyboard.nextDouble();
			if(newPrice >= 0.0) //valid price
			{
				prices[i] = newPrice;
			}
			else
			{
				System.out.println("Nope");
				prices[i] = 0.0;
			}
		}
		double closestPrice = -1.0;
		int winnerIndex = -1;
		for(int i = 0; i < prices.length; i++)
		{
			if(prices[i] <= ACTUAL_PRICE && prices[i] > closestPrice)
			{
				closestPrice = prices[i];
				winnerIndex = i;
			}
		}
		if(winnerIndex == -1) //Everyone guessed over 
		{
			System.out.println("No one wins");
		}
		else
		{
			System.out.println("Congrats contestant "+winnerIndex+" you guessed "+closestPrice+". The actual price was "+ACTUAL_PRICE);
		}
	}

}
