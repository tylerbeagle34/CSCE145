import java.util.Scanner;
import java.util.Random;
public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the heads or tails simulator. \nEnter a number of flips.");
		int flips = keyboard.nextInt();
		int flipCount = 0;
		int headCount = 0;
		int tailCount = 0;
		
		while(flipCount < flips)
		{
			Random r = new Random();
			int coinFlip = r.nextInt(2);
		
			if(coinFlip == 0)
			{
				System.out.println("Heads");
				headCount ++;
				flipCount ++;
			}
			else
			{
				System.out.println("Tails");
				tailCount ++;
				flipCount ++;	
			}
				
		}
		
		System.out.println("The number of heads was "+headCount);
		System.out.println("The number of tails was "+tailCount);
		
		if (headCount > tailCount)
		{
			System.out.println("Heads wins");
		}
		else if (headCount < tailCount)
		{
			System.out.println("Tails wins");
		}
		else
		{
			System.out.println("Heads and Tails tied");
		}
	}
}
