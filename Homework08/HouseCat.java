/*
 * Written by Warren Beagle
 */
public class HouseCat extends Cat{

	//Instance variables
	private String type;
	
	//Constructors
	public HouseCat() //default
	{
		super(); //from the Cat class
		this.type = "No type yet";
	}
	public HouseCat(String aName, double aWeight, String aMood, String aType) //parametrized
	{
		super(aName, aWeight, aMood); //from the Cat class
		this.setType(aType);
	}
	
	//accessors
	public String getType()
	{
		return this.type;
	}
	
	//mutators
	public void setType(String aType)
	{
		if(aType.equalsIgnoreCase("short hair") || aType.equalsIgnoreCase("bombay") || aType.equalsIgnoreCase("ragdoll") || aType.equalsIgnoreCase("sphinx") || aType.equalsIgnoreCase("scottish fold"))
		{
			this.type = aType;
		}
	}
	
	//other methods
	public String toString()
	{
		return "Name: "+super.getName()+" Weight: "+super.getWeight()+" Mood: "+super.getMood()+" Type: "+this.type;
	}
	public boolean equals(HouseCat aHouseCat)
	{
		return aHouseCat != null && this.type.equalsIgnoreCase(getType()) && super.equals(aHouseCat);
	}
}
