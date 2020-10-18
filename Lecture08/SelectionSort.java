import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("Enter some numbers and I'll sort them");
		
		//Populates the array
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Enter number at index "+i);
			a[i] = keyboard.nextInt();
		}
		
		//Selection Sort
		for(int i=0; i < a.length; i++)
		{
			int smallestIndex = i; //Assume smallest value is in the right place
			for(int j = i + 1; j < a.length; j++) //Check smallest value
			{
				if(a[j] < a[smallestIndex])
				{
					smallestIndex = j;
				}
			}
			if(smallestIndex != i) //Found smaller value
			{
				int temp = a[i];
				a[i] = a[smallestIndex];
				a[smallestIndex] = temp;
			}
		}
		System.out.println("The sorted array is");
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
