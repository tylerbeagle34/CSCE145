/*
 * Written by Warren Beagle
 */
import java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a date in the format month/day/year");
		String input = keyboard.nextLine();
		
		String copyInput = input;
		int workingIndex = copyInput.indexOf("/");
		
		String monthX = copyInput.substring(0, workingIndex);
		int month = Integer.parseInt(monthX);
		copyInput = copyInput.substring(workingIndex+1);
		
		String dayX = copyInput.substring(0, workingIndex);
		int day = Integer.parseInt(dayX);
		copyInput = copyInput.substring(workingIndex+1);
		
		String yearX = copyInput.substring(0, workingIndex+2);
		int year = Integer.parseInt(yearX);
		
		if(month > 12 || month < 1)
		{
			System.out.println(input+" is NOT a valid date!");
		}
		else
		{
			if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day >=1 && day <=31))
			{
				System.out.println(input+" is a valid date!");
			}
			else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day >=1 && day <= 30))
			{
				System.out.println(input+" is a valid date!");
			}
			else if (month == 2 && (day >= 1 && day <= 28))
			{
				System.out.println(input+" is a valid date!");
			}
			else if ((month == 2 && (day >= 1 && day <= 29)) && year%4==0)
			{
				if (year%100==0 && year%400==0)
				{
					System.out.println(input+" is a valid date!");
				}
				else if (year%100==0)
				{
					System.out.println(input+" is NOT a valid date!");
				}
				else
				{
					System.out.println(input+" is a valid date!");
				}
			}
			else
			{
				System.out.println(input+" is NOT a valid date!");
			}
		}

	}
}
