/*
 * Written by Warren Beagle and Matthew Vello
 */
public class StringHelper {
	
	public static String meshStrings(String string1, String string2)
	{
		for(int i = 0; i < string1.length(); i++)
		{
			System.out.print(string1.charAt(i));
			if(string2.length() > i)
			{
				System.out.print(string2.charAt(i));
			}
		}
		if(string2.length() > string1.length())
		{
			System.out.print(string2.substring(string1.length(), string2.length()));
		}
		System.out.println();
		return null;
	}
	
	public static String replaceVowelsWithOodle(String string3)
	{
		for(int i = 0; i < string3.length(); i++)
		{
			if(string3.charAt(i) == 'A' || string3.charAt(i) == 'a' || string3.charAt(i) == 'E' || string3.charAt(i) == 'e' || string3.charAt(i) == 'I' || string3.charAt(i) == 'i' ||
					string3.charAt(i) == 'O' || string3.charAt(i) == 'o' || string3.charAt(i) == 'U' || string3.charAt(i) == 'u')
			{
				System.out.print("oodle");
			}
			else
			{
				System.out.print(string3.charAt(i));
			}
		}
		System.out.println();
		return null;
	}
	
	public static double weight(String string4)
	{
		double weight = 0.0;
		for(int i = 0; i < string4.length(); i++)
		{
			if(string4.charAt(i) == 'A' || string4.charAt(i) == 'a' || string4.charAt(i) == 'E' || string4.charAt(i) == 'e' || string4.charAt(i) == 'I' || string4.charAt(i) == 'i' ||
					string4.charAt(i) == 'O' || string4.charAt(i) == 'o' || string4.charAt(i) == 'U' || string4.charAt(i) == 'u')
			{
				weight += 2.5;
			}
			else
			{
				weight += 3.4;
			}
		}
		System.out.println(weight);
		return weight;
	}
}
