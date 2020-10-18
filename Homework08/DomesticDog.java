/*
 * Written by Warren Beagle
 */
public class DomesticDog extends Dog{
	
	//Instance variables
	private String type;

	//Constructors
	public DomesticDog() //default
	{
		super(); //from the Dog class
		this.type = "No type yet";
	}
	public DomesticDog(String aName, double aWeight, int anEnergy, String aType) //parametrized
	{
		super(aName, aWeight, anEnergy); //from the Dog class
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
		if(aType.equalsIgnoreCase("retriever") || aType.equalsIgnoreCase("terrier") || aType.equalsIgnoreCase("husky") || aType.equalsIgnoreCase("yappy") || aType.equalsIgnoreCase("mut"))
		{
			this.type = aType;
		}
	}
	
	//other methods
	public String toString()
	{
		return "Name: "+super.getName()+" Weight: "+super.getWeight()+" Energy Level: "+super.getEnergy()+" Type: "+this.type;
	}
	public boolean equals(DomesticDog aDomesticDog)
	{
		return aDomesticDog != null && this.type.equalsIgnoreCase(getType()) && super.equals(aDomesticDog);
	}
}
