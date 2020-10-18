/*
 * Written by Warren Beagle
 */
public class Cat extends Animal {

	//Instance variables
	private String mood;
	
	//Constructors
	public Cat() //Default
	{
		super(); //Gets the default constructor from Animal
		this.mood = "No mood yet";
	}
	public Cat(String aName, double aWeight, String aMood) //Parametrized
	{
		super(aName, aWeight); //Gets the parametrized constructor from Animal
		this.setMood(aMood);
	}
	
	//Accessors
	public String getMood()
	{
		return this.mood;
	}
	
	//Mutators
	public void setMood(String aMood)
	{
		if(aMood.equalsIgnoreCase("sleepy") || aMood.equalsIgnoreCase("playful") || aMood.equalsIgnoreCase("hungry"))
		{
			this.mood = aMood;
		}
	}
	
	//Other methods
	public String toString()
	{
		return "Name: "+super.getName()+" Weight: "+super.getWeight()+" Mood: "+this.mood;
	}
	public boolean equals(Cat aCat)
	{
		return aCat != null && this.mood.equalsIgnoreCase(getMood()) && super.equals(aCat);
	}
}
