/*
 * Written by Matthew Vello and Warren Beagle
 */
import java.util.Scanner;
public class Lab07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the BMR Calculator!\nFirst are you male or female? Enter M or F");
		Scanner keyboard = new Scanner(System.in);
		String sex = keyboard.nextLine();
		System.out.println("How tall are you in inches?");
		String sInches = keyboard.nextLine();
		System.out.println("What is your weight in pounds?");
		String sPounds = keyboard.nextLine();
		System.out.println("What is your age in years?");
		String sAge = keyboard.nextLine();
		System.out.println("How would you describe your lifestyle?\nSedentary, Somewhat Active, Active, or Highly Active?");
		String lifestyle = keyboard.nextLine();
		
		int inches = Integer.parseInt(sInches);
		int pounds = Integer.parseInt(sPounds);
		int age = Integer.parseInt(sAge);
				
		if(sex.equalsIgnoreCase("F"))
		{
			double BMR = 655 + (4.3 * pounds) + (4.7 * inches) - (4.7 * age);
			if(lifestyle.equalsIgnoreCase("Sedentary"))
			{
				double fBMR = BMR * 1.2;
				System.out.println("Your BMR is "+fBMR+" calories!");
			}
			else if(lifestyle.equalsIgnoreCase("Somewhat Active"))
			{
				double fBMR = BMR * 1.3;
				System.out.println("Your BMR is "+fBMR+" calories!");
			}
			else if(lifestyle.equalsIgnoreCase("Active"))
			{
				double fBMR = BMR * 1.4;
				System.out.println("Your BMR is "+fBMR+" calories!");
			}
			else if(lifestyle.equalsIgnoreCase("Highly Active"))
			{
				double fBMR = BMR * 1.5;
				System.out.println("Your BMR is "+fBMR+" calories!");
			}
			else
			{
				System.out.println("Lifestyle entered incorrectly.");
			}
		}
		else if(sex.equalsIgnoreCase("M"))
		{
			double BMR = 66 + (6.3 * pounds) + (12.9 * inches) - (6.8 * age);
			if(lifestyle.equalsIgnoreCase("Sedentary"))
			{
				double fBMR = BMR * 1.2;
				System.out.println("Your BMR is "+fBMR+" calories!");
			}
			else if(lifestyle.equalsIgnoreCase("Somewhat Active"))
			{
				double fBMR = BMR * 1.3;
				System.out.println("Your BMR is "+fBMR+" calories!");
			}
			else if(lifestyle.equalsIgnoreCase("Active"))
			{
				double fBMR = BMR * 1.4;
				System.out.println("Your BMR is "+fBMR+" calories!");
			}
			else if(lifestyle.equalsIgnoreCase("Highly Active"))
			{
				double fBMR = BMR * 1.5;
				System.out.println("Your BMR is "+fBMR+" calories!");
			}
			else
			{
				System.out.println("Lifestyle entered incorrectly.");
			}
		}
		else
		{
			System.out.println("Gender entered incorrectly.");
		}
		
	}

}
