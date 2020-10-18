import java.util.Scanner;
public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word");
		String input = keyboard.nextLine();
		
		for(int i = 0; i < input.length(); i++)
		{
			for(int j = 0; j < input.length(); j++)
			{
				System.out.print(input);
			}
			System.out.println();
		}
	}

}
