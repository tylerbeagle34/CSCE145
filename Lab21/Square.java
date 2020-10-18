/*
 * Written by Warren Beagle
 */
public class Square {

	//Instance variable
	private int length;
	
	//Constructors
	public Square() //Default
	{
		this.length = 1;
	}
	public Square(int aLengthWidth) //Parameterized
	{
		this.length = aLengthWidth;
	}
	
	//Accessor
	public int getLength()
	{
		return this.length;
	}
	
	//Mutator
	public void setLength(int aLengthWidth) throws DimensionException //Sets the length and checks for exceptions
	{
		if(aLengthWidth > 0)
		{
			this.length = aLengthWidth;
		}
		else
		{
			throw new DimensionException(); //If length <= 0, error
		}
	}
	
	//Other methods
	public void draw() //Draws the square 
	{
		for(int i = 0; i < this.length; i++)
		{
			for(int j = 0; j < this.length; j++)
			{
				System.out.print("*"); //Prints a line of asterisks of the input length
			}
			System.out.println(); //Prints the square
		}
	}
	public int getArea() //Calculates the area of the square
	{
		return this.length*this.length; //Area = side * side
	}
	public int getPerimeter() //Calculates the perimeter of the square
	{
		return 4 * this.length; //Perimeter = 4 * side
	}
}
