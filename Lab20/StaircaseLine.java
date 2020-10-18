/*
* Written by Warren Beagle
*/ 
public class StaircaseLine implements Line {

	private double width;
	private double height;
	
	public StaircaseLine()
	{
		this.width = 1.0;
		this.height = 1.0;
	}
	public StaircaseLine(double aWidth, double aHeight)
	{
		this.setWidth(aWidth);
		this.setHeight(aHeight);
	}
	
	public double getWidth()
	{
		return this.width;
	}
	public double getHeight()
	{
		return this.height;
	}
	
	public void setWidth(double aWidth)
	{
		this.width = aWidth;
	}
	public void setHeight(double aHeight)
	{
		this.height = aHeight;
	}
	
	public double getYPoint(double xPoint)
	{
		int intX = (int)xPoint;
		int intWidth = (int)this.width;
		int intHeight = (int)this.height;
		return (intX / intWidth) * intHeight;
	}
}
