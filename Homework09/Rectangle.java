/*
 * Written by Warren Beagle
 */
public class Rectangle implements Shape {

	//Instance variables
	private double length;
	private double width;
	
	//Constructors
	public Rectangle() //Default
	{
		this.length = 1.0;
		this.width = 1.0;
	}
	public Rectangle(double aLength, double aWidth) //Parameterized
	{
		this.setLength(aLength);
		this.setWidth(aWidth);
	}
	
	//Accessors
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	
	//Mutators
	public void setLength(double aLength)
	{
		if(aLength > 0.0)
		{
			this.length = aLength;
		}
		else
		{
			System.out.println("Invalid length. Length set to 1.0");
			this.length = 1.0;
		}
	}
	public void setWidth(double aWidth)
	{
		if(aWidth > 0.0)
		{
			this.width = aWidth;
		}
		else
		{
			System.out.println("Invalid width. Width set to 1.0");
			this.width = 1.0;
		}
	}
	
	//Other methods from the Shape interface
	public double getArea()
	{
		return this.width * this.length; //returns the area of the rectangle
	}
	public String toString()
	{
		return this.getShapeType()+", Length: "+this.length+", Width: "+this.width+", Area: "+this.getArea(); //returns the string to be printed
	}
	public String getShapeType()
	{
		return "Rectangle"; //returns rectangle
	}
}
