/*
 * Written by Warren Beagle
 */
public class Circle implements Shape {

	//Instance variable
	private double radius;
	
	//Constructors
	public Circle() //Default
	{
		this.radius = 1.0;
	}
	public Circle(double aRadius) //Parameterized
	{
		this.setRadius(aRadius);
	}
	
	//Accessor
	public double getRadius()
	{
		return this.radius;
	}
	
	//Mutator
	public void setRadius(double aRadius)
	{
		if(aRadius > 0.0)
		{
			this.radius = aRadius;
		}
		else
		{
			System.out.println("Invalid radius. Radius set to 1.0");
			this.radius = 1.0;
		}
	}
	
	//Other methods from the Shape interface
	public double getArea()
	{
		return Math.PI * Math.pow(this.radius, 2); //returns the area of the circle
	}
	public String toString()
	{
		return this.getShapeType()+", Radius: "+this.radius+", Area: "+this.getArea(); //returns the string to be printed
	}
	public String getShapeType()
	{
		return "Circle"; //returns circle
	}
}
