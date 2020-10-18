/*
* Written by Warren Beagle
*/
public class SineLine implements Line {

	private double amplitude;
	private double frequency;
	
	public SineLine()
	{
		this.amplitude = 1.0;
		this.frequency = 1.0;
	}
	public SineLine(double anAmplitude, double aFrequency)
	{
		this.setAmplitude(anAmplitude);
		this.setFrequency(aFrequency);
	}
	
	public double getAmplitude()
	{
		return this.amplitude;
	}
	public double getFrequency()
	{
		return this.frequency;
	}
	
	public void setAmplitude(double anAmplitude)
	{
		this.amplitude = anAmplitude;
	}
	public void setFrequency(double aFrequency)
	{
		this.frequency = aFrequency;
	}
	
	public double getYPoint(double xPoint)
	{
		return this.amplitude * Math.sin(xPoint * this.frequency);
	}
}
