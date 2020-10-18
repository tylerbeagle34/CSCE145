import java.util.Scanner;
public class EveryDayStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Are you wearing pants? Enter \"true\" or \"false\"");
		boolean wearingPants = keyboard.nextBoolean();
		
		if (wearingPants == true)
		{
			System.out.println("Nice pants!");
		}
		else
		{
			System.out.println("You're under arrest");
		}
	}

}
