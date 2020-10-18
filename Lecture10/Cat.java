
public class Cat {
	//Attributes of instance variables
	private String name;
	private double weight;
	private int numberOfLegs;
	
	//Constructor
	public Cat()
	{
		this.name = "no name";
		this.weight = 0.0;
		this.numberOfLegs = 4;
	}
	public Cat(String aName, double aWeight, int aNumberOfLegs)
	{
		this.setName(aName);
		this.setWeight(aWeight);
		this.setNumberOfLegs(aNumberOfLegs);
	}
	
	//Accessors
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public int getNumbeOfLegs()
	{
		return this.numberOfLegs;
	}
	//Mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setWeight(double aWeight)
	{
		if(aWeight > 0)
		{
			this.weight = aWeight;
		}
	}
	public void setNumberOfLegs(int aNumberOfLegs)
	{
		if(aNumberOfLegs >= 0 && aNumberOfLegs <= 4)
		{
			this.numberOfLegs = aNumberOfLegs;
		}
	}
	//Other methods
	public String toString()
	{
		return this.name+" "+this.weight+" "+this.numberOfLegs;
	}
	public boolean equals(Cat aCat)
	{
		return aCat != null && this.name.equals(aCat.getName()) && this.weight == aCat.getWeight() && this.numberOfLegs == aCat.getNumbeOfLegs();
	}
	public void eat()
	{
		this.weight += 1.0;
	}
	public void sleep()
	{
		System.out.println("ZZZZZ");
	}
	public void destoryLife()
	{
		System.out.println(this.name+" is dead");
	}
}
