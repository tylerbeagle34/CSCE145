/*
* Written by Warren Beagle
*/
public class SawLine implements Line {

	private double modValue;
	
	public SawLine()
	{
		this.modValue = 1.0;
	}
	public SawLine(double aModValue)
	{
		this.setModValue(aModValue);
	}
	
	public double getModValue()
	{
		return this.modValue;
	}
	
	public void setModValue(double aModValue)
	{
		this.modValue = aModValue;
	}
	
	public double getYPoint(double xPoint)
	{
		return xPoint % this.modValue;
	}
}
