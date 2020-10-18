import java.util.Scanner;
public class Lab09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Triangle Maker 9000. Enter the size of the triangle.");
		int size = keyboard.nextInt();
		
		if(size <= 0)
		{
			System.out.println("That's not a correct input");
			System.exit(0);
		}
		
		for(int i = 0; i <= size; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int k = size - 1; k >= 0; k--)
		{
			for(int l = k - 1; l >= 0; l--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
