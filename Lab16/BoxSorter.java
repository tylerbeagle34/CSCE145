/*
 * Written by Warren Beagle
 */
import java.util.Scanner;
public class BoxSorter {

	public static final int NUMBER_OF_BOXES = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box[] boxes = new Box[NUMBER_OF_BOXES];
		System.out.println("Welcome to the box sorter!"
				+"\nEnter the information about boxes and I'll sort them!");
		for(int i = 0; i < NUMBER_OF_BOXES; i++)
		{
			Scanner keyboard = new Scanner(System.in);
			boxes[i] = new Box();
			System.out.println("Enter the label, length, width, and height (all feet) of box "+(i+1));
			boxes[i].setLabel(keyboard.nextLine());
			boxes[i].setLength(keyboard.nextDouble());
			boxes[i].setWidth(keyboard.nextDouble());
			boxes[i].setHeight(keyboard.nextDouble());
		}
		boolean whileSort = true;
		while(whileSort)
		{
			whileSort = false;
			for(int i = 0; i < NUMBER_OF_BOXES - 1; i++)
			{
				if(boxes[i].getVolume() > boxes[i+1].getVolume())
				{
					Box temp = boxes[i];
					boxes[i] = boxes[i+1];
					boxes[i+1] = temp;
					whileSort = true;
				}
			}
		}
		for(int i = 0; i < NUMBER_OF_BOXES; i++)
		{
			System.out.println(boxes[i].toString());
		}
	}
}
