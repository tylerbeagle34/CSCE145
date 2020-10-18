/*
 * Written by Warren Beagle
 */
public class Dog extends Animal {

	//Instance variables
	private int energy;
		
	//Constructors
	public Dog() //Default
	{
		super(); //Gets the default constructor from Animal
		this.energy = 0;
	}
	public Dog(String aName, double aWeight, int anEnergy) //Parametrized
	{
		super(aName, aWeight); //Gets the parametrized constructor from Animal
		this.setEnergy(anEnergy);
	}
		
	//Accessors
	public int getEnergy()
	{
		return this.energy;
	}
		
	//Mutators
	public void setEnergy(int anEnergy)
	{
		if(anEnergy >= 0 && anEnergy <= 100)
		{
			this.energy = anEnergy;
		}
	}
		
	//Other methods
	public String toString()
	{
		return "Name: "+super.getName()+" Weight: "+super.getWeight()+" Energy Level: "+this.energy;
	}
	public boolean equals(Cat aCat)
	{
		return aCat != null && this.energy == aCat.getWeight() && super.equals(aCat);
	}
}
