/*
 * Written by Warren Beagle
 */
public class Triangle implements Shape{

	//Instance variables
	private double base;
	private double height;
	
	//Constructors
	public Triangle() //Default
	{
		this.base = 1.0;
		this.height = 1.0;
	}
	public Triangle(double aBase, double aHeight) //Parameterized
	{
		this.setBase(aBase);
		this.setHeight(aHeight);
	}
	
	//Accessors
	public double getBase()
	{
		return this.base;
	}
	public double getHeight()
	{
		return this.height;
	}
	
	//Mutators
	public void setBase(double aBase)
	{
		if(aBase > 0.0)
		{
			this.base = aBase;
		}
		else
		{
			System.out.println("Invalid base. Base set to 1.0");
			this.base = 1.0;
		}
	}
	public void setHeight(double aHeight)
	{
		if(aHeight > 0.0)
		{
			this.height = aHeight;
		}
		else
		{
			System.out.println("Invalid height. Height set to 1.0");
			this.height = 1.0;
		}
	}
	
	//Other methods from the Shape Interface
	public double getArea()
	{
		return 0.5 * this.base * this.height; //returns the area of the triangle
	}
	public String toString()
	{
		return this.getShapeType()+", Base: "+this.base+", Height: "+this.height+", Area: "+this.getArea(); //returns what will be printed
	}
	public String getShapeType()
	{
		return "Triangle"; //returns triangle
	}
}
