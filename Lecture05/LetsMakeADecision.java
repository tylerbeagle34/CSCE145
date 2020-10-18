import java.util.Scanner;
public class LetsMakeADecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String boxPrize = "3 Dead Batteries";
		String dollarPrize = "$1";
		String pocketPrize = "$10 Amazon Gift Card";
		
		System.out.println("Contestant 1. I will give you this crisp "+dollarPrize);
		System.out.println("Will you keep the dollar or take what's in the pocket or the box?");
		System.out.println("Enter \"keep\" to keep the dollar, \"pocket\" for pocket, or \"box\" to take what's in the box");
		
		String answer = keyboard.nextLine();
		
		String cont1Prize = "nothing";
		String cont2Prize = "nothing";
		
		if(answer.equalsIgnoreCase("keep") == true)
		{
			cont1Prize = dollarPrize;
			System.out.println("Contestant 2 you can pick the \"box\" or the pocket \"pocket\"");
			answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("box"))
			{
				cont2Prize = boxPrize;
			}
			else if(answer.equalsIgnoreCase("pocket"))
			{
				cont2Prize = pocketPrize;
			}
			else
			{
				System.out.println("You get nothing");
			}
		}
		else if(answer.equalsIgnoreCase("box") == true)
		{
			cont1Prize = boxPrize;
			System.out.println("Contestant 2 you can pick the \"keep\" or the pocket \"pocket\"");
			answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("keep"))
			{
				cont2Prize = dollarPrize;
			}
			else if(answer.equalsIgnoreCase("pocket"))
			{
				cont2Prize = pocketPrize;
			}
			else
			{
				System.out.println("You get nothing");
			}
		}
		else if(answer.equalsIgnoreCase("pocket") == true)
		{
			cont1Prize = pocketPrize;
			System.out.println("Contestant 2 you can pick the \"keep\" or the pocket \"box\"");
			answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("keep"))
			{
				cont2Prize = dollarPrize;
			}
			else if(answer.equalsIgnoreCase("box"))
			{
				cont2Prize = boxPrize;
			}
			else
			{
				System.out.println("You get nothing");
			}
		}
		else
		{
			System.out.println("No one gets anything");
		}
		System.out.println("Contestant 1 won "+cont1Prize+"\nContestant 2 won "+cont2Prize);
	}

}
