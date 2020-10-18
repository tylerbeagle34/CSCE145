/**
 * Written by Matthew Vello and Warren Beagle
 */
import java.util.Scanner;
public class Lab04 {
  
  
  public static void main(String[] args) { 
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Enter a time in the format \"hours:minutes:seconds\" and I will give you the time in seconds");
  String input = keyboard.nextLine();
  
  String copyInput = input;
  int workingIndex = copyInput.indexOf(":");
  
  String hourx = copyInput.substring(0,workingIndex);
  int hour = Integer.parseInt(hourx);
  copyInput = copyInput.substring(workingIndex+1);
  
  String minutex = copyInput.substring(0,workingIndex);
  int minute = Integer.parseInt(minutex);
  copyInput = copyInput.substring(workingIndex+1);
  
  String secondx = copyInput.substring(0,workingIndex);
  int second = Integer.parseInt(secondx);
  
  int hourS = hour * 3600;
  int minuteS = minute * 60;
  int tSeconds = hourS+minuteS+second;
  
  System.out.println("The number of seconds are "+tSeconds);
  System.out.println("Enter a number of seconds to add");
  int secondIn = keyboard.nextInt();
  
  int totalSeconds = tSeconds + secondIn;
  int newHour = totalSeconds / 3600;
  int remainder1 = totalSeconds % 3600;
  
  int newMinute = remainder1 / 60;
  int remainder2 = remainder1 % 60;
  
  System.out.println("The new time is "+newHour+":"+newMinute+":"+remainder2);
  
  }
  
  /* ADD YOUR CODE HERE */
  
}