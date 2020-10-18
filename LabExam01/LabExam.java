/*
 * Written by Warren Beagle
 */
import java.util.Random;
public class LabExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[100]; //Create an array of size 100
		Random r = new Random();
		System.out.println("Random Array:");
		for(int i = 0; i < array.length; i++)
		{
			array[i] = r.nextInt(100); //Populate the array
			System.out.println(array[i]); //Prints the unsorted array
 		}
		
		//Selection Sort
		for(int i=0; i < array.length; i++)
		{
			int smallestIndex = i; //Assume smallest value is in the right place
			for(int j = i + 1; j < array.length; j++) //Check smallest value
			{
				if(array[j] < array[smallestIndex])
				{
					smallestIndex = j;
				}
			}
			if(smallestIndex != i) //Found smaller value
			{
				int temp = array[i];
				array[i] = array[smallestIndex];
				array[smallestIndex] = temp;
			}
		}
		System.out.println("\nSorted Array:");
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]); //Prints the sorted array
		}
		
		int median = (array[49] + array[50])/2; //Calculates median
		System.out.println("\nMedian is: "+median); //Prints median
	}

}
