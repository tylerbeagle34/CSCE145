import java.util.Scanner;
public class GradeAverager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the GradeAverager");
		String input = "";
		do
		{
			System.out.println("Enter grades, and once you're finished enter a negative number");
			int grade = keyboard.nextInt();
			int avg = 0;
			int count = 0;
			while(grade >= 0)
			{
				avg += grade;
				count ++;
				grade = keyboard.nextInt();
			}
			avg /= count;
			System.out.println("The average is "+avg);
			System.out.println("Do you want to average more grades? If not enter \"quit\"");
			input = keyboard.nextLine();
		}
		while(input.equalsIgnoreCase("Quit") == false);
	}

}
