/*
 * Alex Long and Warren Beagle 
 */

import java.util.Scanner;
public class Lab06 {
  
  
  public static void main(String[] args) { 
    Scanner keyboard = new Scanner(System.in);
    System.out.println ("Enter the date of your birth: Month Day");
    // Date input
    String input = keyboard.nextLine();
    String copyInput = input;
    
    //Indexing and slicing
    int workingIndex = copyInput.indexOf(" ");
    String month = copyInput.substring(0, workingIndex);
    String day = copyInput.substring (workingIndex +1); //***
    int month_int = Integer.parseInt(month);
    int day_int = Integer.parseInt(day); 
    String zodiac = " "; 
   
    // Zodiac assignment 
    if ( month_int > 0 && month_int <= 12 && day_int > 0 && day_int <=31)
    {
    
    
    if ((month_int == 12 && day_int >= 22) || ( month_int == 1 && day_int <=19 ))
    {  zodiac = "Capricorn" ;
    }
    else if ((month_int == 1 && day_int >= 20) || ( month_int == 2 && day_int <=18 ))
      {  zodiac = "Aquarius" ;
      }
    else if ((month_int == 2 && day_int >=19 ) || ( month_int == 3 && day_int <=20 ))
      {  zodiac = "Pisces" ;
      }
    else if ((month_int == 3 && day_int >= 21) || ( month_int == 4 && day_int <=19 ))
      {  zodiac = "Aries" ;
      }
    else if ((month_int == 4 && day_int >= 20) || ( month_int == 5 && day_int <=20 ))
      {  zodiac = "Taurus" ;
      }
    else if ((month_int == 5 && day_int >= 21) || ( month_int == 6 && day_int <=20 ))
      {  zodiac = "Gemini" ;
      }
    else if ((month_int == 6 && day_int >= 21) || ( month_int == 7 && day_int <=22 ))
      {  zodiac = "Cancer" ;
      }
    else if ((month_int == 7 && day_int >= 23) || ( month_int == 8 && day_int <=22 ))
      { zodiac = "Leo" ;
      }
    else if ((month_int == 8 && day_int >= 23) || ( month_int == 9 && day_int <=22 ))
      {  zodiac = "Virgo"; 
      }
    else if ((month_int == 9 && day_int >= 23) || ( month_int == 10 && day_int <=22 ))
      {  zodiac = "Libra" ;
      }
    else if ((month_int == 10 && day_int >= 23) || ( month_int == 11 && day_int <=21 ))
      {  zodiac = "Scorpio"; 
      }
    else if((month_int == 11 && day_int >= 22) || ( month_int == 12 && day_int <=21 ))
      {  zodiac = "Sagittarius"; 
      }
    
    
    System.out.println ("You are a " + zodiac);
    }
    else 
    {System.out.println ("Error");
    }

  }
  
  /* ADD YOUR CODE HERE */
  
}