/*
 * Written by Warren Beagle and Graham Shroyer
 */
import java.util.Scanner;
public class Converter {
  
  public static void main(String[] args) 
  { 
    System.out.println("Welcome to the weight and height converter 9000!");
    System.out.println("Enter a weight in pounds");
    Scanner keyboard = new Scanner(System.in);  
    double weightLb = keyboard.nextDouble(); //Enter weight 
    System.out.println("Enter a height in feet");
    double heightFt = keyboard.nextDouble(); //Enter height 
    
    System.out.println(weightLb+"lbs is "+(weightLb*0.456)+" kilograms"); //Conversions
    System.out.println(weightLb+"lbs is "+(weightLb*0.071)+" stones");
    System.out.println(weightLb+"lbs is "+(weightLb*0.031)+" slugs");
    System.out.println(weightLb+"lbs is "+(weightLb*291.667)+" pennyweights");
    System.out.println(weightLb+"lbs is "+(weightLb*7000)+" grains");
    
    System.out.println(heightFt+"ft is "+(heightFt*0.305)+" meters");
    System.out.println(heightFt+"ft is "+(heightFt*3)+" hands");
    System.out.println(heightFt+"ft is "+(heightFt*0.002)+" furlongs");
    System.out.println(heightFt+"ft is "+(heightFt*0.667)+" cubits");
    System.out.println(heightFt+"ft is "+(heightFt*6.857)+" rack units");
  }
  
}