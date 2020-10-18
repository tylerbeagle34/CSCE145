/*
 * Written by Warren Beagle
 */
public class Leopard extends Cat{

	//Instance variables
	private int spots;
	
	//Constructors
	public Leopard() //default
	{
		super(); //from the Cat class
		this.spots = 0;
	}
	public Leopard(String aName, double aWeight, String aMood, int aSpots) //parametrized
	{
		super(aName, aWeight, aMood); //from the Cat class
		this.setSpots(aSpots);
	}
	
	//Accessors
	public int getSpots()
	{
		return this.spots;
	}
	
	//mutators
	public void setSpots(int aSpots)
	{
		if(aSpots >= 0)		
		{
			this.spots = aSpots;
		}
	}
	
	//other methods
	public String toString()
	{
		return "Name: "+super.getName()+" Weight: "+super.getWeight()+" Mood: "+super.getMood()+" Number of Spots: "+this.spots;
	}
	public boolean equals(Leopard aLeopard)
	{
		return aLeopard != null && this.spots == aLeopard.getSpots() && super.equals(aLeopard);
	}
}
