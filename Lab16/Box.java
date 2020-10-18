/*
 * Written by Warren Beagle
 */
public class Box {
	
	//Instance Variables
	private String label;
	private double length;
	private double width;
	private double height;
	
	//Constructors
	public Box() //Default
	{
		this.label = "no label yet";
		this.length = 0.0;
		this.width = 0.0;
		this.height = 0.0;
	}
	public Box(String aLabel, double aLength, double aWidth, double aHeight) //Parametrized
	{
		this.setLabel(aLabel);
		this.setLength(aLength);
		this.setWidth(aWidth);
		this.setHeight(aHeight);
	}
	
	//Accessors
	public String getLabel()
	{
		return this.label;
	}
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public double getHeight()
	{
		return this.height;
	}
	
	//Mutators
	public void setLabel(String aLabel)
	{
		this.label = aLabel;
	}
	public void setLength(double aLength)
	{
		if(aLength > 0.0)
		{
			this.length = aLength;
		}
	}
	public void setWidth(double aWidth)
	{
		if(aWidth > 0.0)
		{
			this.width = aWidth;
		}
	}
	public void setHeight(double aHeight)
	{
		if(aHeight > 0.0)
		{
			this.height = aHeight;
		}
	}
	
	//Other methods
	public double getVolume()
	{
		return this.length*this.width*this.height;
	}
	public String toString()
	{
		return "Label: "+this.label+" Volume: "+this.getVolume();
	}
}
