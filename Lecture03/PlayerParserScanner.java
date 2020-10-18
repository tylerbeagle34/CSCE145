import java.util.Scanner;

public class PlayerParserScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the player name, followed by the id(int)"+"then x,y,z position (double). Separate via spaces");
		
		String input = keyboard.nextLine();
				
		Scanner strScanner = new Scanner(input);
		
		String name = strScanner.next();
		int id = strScanner.nextInt();
		double x = strScanner.nextDouble();
	}

}
