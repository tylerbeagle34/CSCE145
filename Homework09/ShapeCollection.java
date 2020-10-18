/*
 * Written by Warren Beagle
 */
public class ShapeCollection {

	//Instance variables
	private Shape[] shapes;
	public static final int MAX_SHAPES = 100;
	
	//Constructors
	public ShapeCollection() //Default
	{
		shapes = new Shape[MAX_SHAPES];
	}
	
	//Accessors
	public Shape[] getShapes()
	{
		return this.shapes;
	}
	
	//Other methods
	public void addShape(Shape aShape) //Add shape 
	{
		for(int i = 0; i < shapes.length; i++)
		{
			if(shapes[i] == null)
			{
				shapes[i] = aShape; //sets the i position in the array to the shape
				return;
			}
		}
		System.out.println("The max number of shapes has been reached!");
	}
	private void sortShapes() //Sorts the shapes
	{
		boolean whileSort = true;
		while(whileSort)
		{
			whileSort = false;
			for(int i = 0; i < shapes.length - 1; i++)
			{
				if(shapes[i+1] == null)
				{
					break;
				}
				else if(shapes[i].getArea() > shapes[i+1].getArea())
				{
					Shape temp = shapes[i];
					shapes[i] = shapes[i+1];
					shapes[i+1] = temp;
					whileSort = true;
				}
			}
		}
	}
	public void removeShape(String aShapeType, double aShapeArea) //remove shape with a type and an area
	{
		int removeIndex = -1;
		for(int i = 0; i < shapes.length; i++)
		{
			if(shapes[i] != null && shapes[i].getShapeType().equalsIgnoreCase(aShapeType) && shapes[i].getArea() == aShapeArea) //checks for type and area
			{
				removeIndex = i;
				break;
			}
		}
		if(removeIndex == -1)
		{
			System.out.println("Shape not found");
		}
		else
		{
			for(int i = removeIndex; i < shapes.length - 1; i++)
			{
				shapes[i] = shapes[i+1]; 
			}
			shapes[shapes.length - 1] = null; //moves shapes
		}
	}
	public void printShapes() //print the shapes
	{
		sortShapes(); //sorts the shapes prior to printing them
		for(int i = 0; i < shapes.length; i++)
		{
			if(shapes[i] == null)
			{
				break;
			}
			else
			{
				System.out.println(shapes[i].toString()); //prints the shapes using the toString method in each class
			}
		}
	}
}
