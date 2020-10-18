/*
* Written by Warren Beagle
*/
public class SlopedLine implements Line {

	private double slope;
	
	public SlopedLine()
	{
		this.slope = 1.0;
	}
	public SlopedLine(double aSlope)
	{
		this.setSlope(aSlope);
	}
	
	public double getSlope()
	{
		return this.slope;
	}
	
	public void setSlope(double aSlope)
	{
		this.slope = aSlope;
	}
	
	public double getYPoint(double xPoint)
	{
		return this.slope * xPoint;
	}
}
