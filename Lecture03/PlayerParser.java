import java.util.Scanner;
public class PlayerParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the player name, followed by the id(int)"+"then x,y,z position (double). Separate via spaces");
		
		String input = keyboard.nextLine();
		
		String copyInput = input; //makes a working copy of the input
		
		//gets the name of the player 
		int workingIndex = copyInput.indexOf(" ");
		String name = copyInput.substring(0,workingIndex);
		//removes the name part and continues
		copyInput = copyInput.substring(workingIndex+1);
		
		//gets the player id
		workingIndex = copyInput.indexOf(" ");
		String sID = copyInput.substring(0,workingIndex);
		int id = Integer.parseInt(sID); //converts string into int
		copyInput = copyInput.substring(workingIndex+1);
		
		//get the x position
		workingIndex = copyInput.indexOf(" ");
		String sX = copyInput.substring(0,workingIndex);
		double x = Double.parseDouble(sX);
		copyInput = copyInput.substring(workingIndex+1);
	}

}
