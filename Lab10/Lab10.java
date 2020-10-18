import java.util.Scanner;
public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the above average temperature tester");
		
		double temperatures[] = new double[10];
		
		for(int i = 0; i < temperatures.length; i++)
		{
			System.out.println("Please enter the temperature for day "+(i+1));
			double newTemperature = keyboard.nextDouble();
			temperatures[i] = newTemperature;
		}
		
		double sum = 0;
		double average = 0;
		
		for(int i = 0; i < temperatures.length; i++)
		{
			sum = sum + temperatures[i];
			average = sum/temperatures.length;
		}
		
		System.out.println("The average temperature was "+average);
		System.out.println("The days that were above average were:");
		
		for(int i = 0; i < temperatures.length; i++)
		{
			if(temperatures[i] > average)
			{
				System.out.println("Day "+(i+1)+" with "+temperatures[i]);
			}
		}
	}
}
