/*
 * Written by Warren Beagle
 */
public class Wolf extends Dog{
	
	//Instance variables
	private String packLeader;

	//Constructors
	public Wolf() //default
	{
		super(); //from the Dog class
		this.packLeader = "No pack leader yet";
	}
	public Wolf(String aName, double aWeight, int anEnergy, String aPackLeader) //parametrized
	{
		super(aName, aWeight, anEnergy); //from the Dog class
		this.setPackLeader(aPackLeader);
	}
	
	//accessors
	public String getPackLeader()
	{
		return this.packLeader;
	}
	
	//mutators
	public void setPackLeader(String aPackLeader)
	{
		this.packLeader = aPackLeader;
	}
	
	//other methods
	public String toString()
	{
		return "Name: "+super.getName()+" Weight: "+super.getWeight()+" Energy Level: "+super.getEnergy()+" Pack Leader: "+this.packLeader;
	}
	public boolean equals(Wolf aWolf)
	{
		return aWolf != null && this.packLeader.equalsIgnoreCase(getPackLeader()) && super.equals(aWolf);
	}
}
