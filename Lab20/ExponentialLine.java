/*
* Written by Warren Beagle
*/
public class ExponentialLine implements Line {

	private double exponent;
	
	public ExponentialLine()
	{
		this.exponent = 1.0;
	}
	public ExponentialLine(double anExponent)
	{
		this.setExponent(anExponent);
	}
	
	public double getExponent()
	{
		return this.exponent;
	}
	
	public void setExponent(double anExponent)
	{
		this.exponent = anExponent;
	}
	
	public double getYPoint(double xPoint)
	{
		return Math.pow(xPoint, this.exponent);
	}
	
}
