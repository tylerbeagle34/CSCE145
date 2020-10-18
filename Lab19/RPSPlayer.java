/*
 * Written by Warren Beagle
 */
public class RPSPlayer implements RPSPlayerInterface {

	//Instance Variables
	private String gesture;
	private int points;
	
	//Constructors
	public RPSPlayer() //Default
	{
		this.gesture = "none";
		this.points = 0;
	}
	
	//Accessors
	public String getGesture()
	{
		return this.gesture;
	}
	public int getPoints()
	{
		return this.points;
	}
	
	//Mutators
	public void setGesture(String aGesture)
	{
		if(aGesture.equalsIgnoreCase("rock") || aGesture.equalsIgnoreCase("paper") || aGesture.equalsIgnoreCase("scissors"))
		{
			this.gesture = aGesture;
		}
		else
		{
			System.out.println("Incorrect Choice");
			this.gesture = "none";
		}
	}
	public void setPoints(int aPoints)
	{
		this.points = aPoints;
	}
	
	//Other methods
	public void chooseGesture()
	{
		this.gesture = "none";
	}
}
