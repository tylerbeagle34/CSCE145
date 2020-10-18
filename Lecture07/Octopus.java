import java.util.Scanner;
public class Octopus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("I'm an octopus, so I like the number 8");
		System.out.println("Give a positive number and I'll count up to it by 8");
		
		int input = keyboard.nextInt();
		
		if(input < 0)
		{
			System.out.println("That's not a correct input");
			System.exit(0);
		}
		/*
		for(int i = 1; i <= input; i++)
		{
			if(i % 8 == 0)
			{
				System.out.println(i);
			}
		}
		*/
		for(int i = 0; i <= input; i += 8)
		{
			System.out.println(i);
		}
	}

}
