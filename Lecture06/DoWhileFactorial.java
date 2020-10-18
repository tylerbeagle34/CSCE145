import java.util.Scanner;
public class DoWhileFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number from 1 to whatever, and I'll factorial it.");
		int factInput = keyboard.nextInt();
		if(factInput <= 0)
		{
			System.out.println("No!");
			System.exit(0);
		}
		
		int workingFact = factInput; //Makes a copy
		int factorial = 1; //Final result
		do
		{
			factorial += workingFact;
			workingFact--;
		}
		while(workingFact > 0);
		System.out.println("The factorial of "+factInput+" is equal to "+factorial);
	}

}
