/*
 * Written by Matthew Vello and Warren Beagle
 */
import java.util.Scanner;
public class Lab12 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  System.out.println("Enter any phrase and I'll count the number of vowels, then sort them!");
  Scanner keyboard = new Scanner(System.in);
  String phrase = keyboard.nextLine();
  
  int[][] vowels = new int[5][5];
  
  for(int i=0;i<vowels.length;i++)
  {
    vowels[i][0] = 0;
    vowels[i][1] = (i+1);
  }
  
  for(int i=0;i<phrase.length();i++)
  {
   if(phrase.substring(i,i+1).equalsIgnoreCase("a"))
   {
    vowels[0][0]++;
   }
   else if(phrase.substring(i,i+1).equalsIgnoreCase("e"))
   {
    vowels[1][0]++;
   }
   else if(phrase.substring(i,i+1).equalsIgnoreCase("i"))
   {
    vowels[2][0]++;
   }
   else if(phrase.substring(i,i+1).equalsIgnoreCase("o"))
   {
    vowels[3][0]++;
   }
   else if(phrase.substring(i,i+1).equalsIgnoreCase("u"))
   {
    vowels[4][0]++;
   }
  }
  
  System.out.println("The vowels from lowest amount to highest:");
  
  for(int i=0;i<vowels.length;i++)
  {
    int smallestIndex = i;
    for(int j = i+1; j<vowels.length;j++)
    {
      if(vowels[j][0] < vowels[smallestIndex][0])
      {
        smallestIndex = j;
      }
    }
    if(smallestIndex != i)
    {
      int temp = vowels[i][0];
      int temp2 = vowels[i][1];
      vowels[i][0] = vowels[smallestIndex][0];
      vowels[i][1] = vowels[smallestIndex][1];
      vowels[smallestIndex][0] = temp;
      vowels[smallestIndex][1] = temp2;
    }
  }
  
  for(int i=0;i<vowels.length;i++)
  {
    if(vowels[i][1] == 1)
    {
      System.out.print("a ");
    }
    else if(vowels[i][1] == 2)
    {
      System.out.print("e ");
    }
    else if(vowels[i][1] == 3)
    {
      System.out.print("i ");
    }
    else if(vowels[i][1] == 4)
    {
      System.out.print("o ");
    }
    else if(vowels[i][1] == 5)
    {
      System.out.print("u ");
    }
    System.out.print(vowels[i][0]);
    System.out.println("");
  }
 }

}