import java.util.Scanner;
public class DrawABox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me a length followed by a width and I'll draw a box");
		
		int length = keyboard.nextInt();
		int width = keyboard.nextInt();
		
		if(length <= 0 || width <= 0)
		{
			System.out.println("Invalid dimensions");
			System.exit(0);
		}
		
		for(int i = 0; i < length; i++) //Outside loop for length
		{
			for(int j = 0; j < width; j++) //Inside loop for width
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
