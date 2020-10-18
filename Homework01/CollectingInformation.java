/*
 *  Written by Warren Beagle
 */

import java.util.Scanner;
public class CollectingInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your name"); //Name question
		Scanner keyboard = new Scanner(System.in); 
		String name = keyboard.nextLine(); //Input string for name
		
		System.out.println("Enter your age"); //Age question
		int age = keyboard.nextInt(); //Input int for age 
		
		System.out.println("Enter your height (in meters)"); //Height question
		float height = keyboard.nextFloat(); //Input float for height
		
		System.out.println("Enter your blood type"); //Blood type question
		Scanner keyboard1 = new Scanner(System.in);
		String bloodType = keyboard1.nextLine(); //Input string for blood typer
		
		System.out.println("Are you a cat person? True or false"); //Cat person question
		Boolean cat = keyboard1.nextBoolean(); //Input bool for cat person
		
		System.out.println("Are you a dog person? True or false"); //Dog person question
		Boolean dog = keyboard1.nextBoolean(); //Input bool for dog person
		
		System.out.println("Are you a reptilian shape shifter? True or false"); //Shape shifter question
		Boolean reptilian = keyboard1.nextBoolean(); //Input bool for shape shifter
		
		System.out.println("How much gold do you have on your land (in kilograms)?"); //Gold question
		float gold = keyboard1.nextFloat(); //Input float for gold
		
		System.out.println("Name: "+name); //Print name
		System.out.println("Age: "+age); //Print age
		System.out.println("Height: "+height+"m"); //Print height (in meters
		System.out.println("Blood Type: "+bloodType); //Print blood type
		System.out.println("Cat Person: "+cat); //Print cat
		System.out.println("Dog Person: "+dog); //Print dog
		System.out.println("Reptilian Shape Shifter: "+reptilian); //Print shape shifter
		System.out.println("Amount of Gold on Land: "+gold+"kg"); //Print gold (in kilograms)
		
		
	}

}