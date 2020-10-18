/*
 * Written by Warren Beagle
 */
import java.util.Scanner;
public class ShapeFrontEnd {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Shape shape;
		Rectangle rectangle;
		Circle circle;
		Triangle triangle;
		ShapeCollection shapeCollection = new ShapeCollection();
		System.out.println("Welcome to the Shapes Collection");
		boolean quit = false;
		while(!quit) //Runs until the user quits
		{
			rectangle = new Rectangle(); //Creates a new Rectangle
			circle = new Circle(); //Creates a new Circle
			triangle = new Triangle(); //Creates a new Triangle
			System.out.println("\nWould you like to:\n" + //Prompts the user
					"1. Add a shape\n" +
					"2. Remove a shape\n" +
					"3. Quit\n");
			int pick = keyboard.nextInt(); //User input
			keyboard.nextLine();
			switch(pick)
			{
				case 1: //Add shape
					System.out.println("What type of Shape? \nRectangle, Triangle, or Circle"); //Prompt user
					String type = keyboard.nextLine(); //user input
					if(type.equalsIgnoreCase("rectangle"))
					{
						System.out.println("Enter the length followed by the width"); //Prompts the user
						rectangle.setLength(keyboard.nextDouble()); //User input
						keyboard.nextLine();
						rectangle.setWidth(keyboard.nextDouble());
						keyboard.nextLine();
						shapeCollection.addShape(rectangle); //Adds rectangle 
					}
					else if(type.equalsIgnoreCase("triangle"))
					{
						System.out.println("Enter the base followed by the height"); //Prompts the user
						triangle.setBase(keyboard.nextDouble()); //User input
						keyboard.nextLine();
						triangle.setHeight(keyboard.nextDouble());
						keyboard.nextLine();
						shapeCollection.addShape(triangle); //Adds triangle
					}
					else if(type.equalsIgnoreCase("circle"))
					{
						System.out.println("Enter the radius"); //Prompts the user
						circle.setRadius(keyboard.nextDouble()); //User input
						keyboard.nextLine();
						shapeCollection.addShape(circle); //Adds Circle
					}
					else
					{
						System.out.println("Invalid shape. Pick Again");
					}
					shapeCollection.printShapes(); //Prints the shapes 
					break;
				case 2: //Remove shape
					System.out.println("Enter the type of shape followed by the area to remove the shape"); //prompts the user 
					String shapeType = keyboard.nextLine();
					double area = keyboard.nextDouble();
					keyboard.nextLine();
					shapeCollection.removeShape(shapeType, area); //removes the shape with the type and area
					shapeCollection.printShapes(); //prints the shapes
					break;
				case 3: //Exits
					quit = true;
					break;
				default:
					System.out.println("Invalid input");
			}
		}
		System.out.println("Goodbye");
	}
}
