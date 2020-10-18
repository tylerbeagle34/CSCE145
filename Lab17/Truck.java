/*
 * Written by Warren Beagle
 */
public class Truck extends Vehicle {
	
	//Instance Variables
	private double loadCap;
	private double towCap;
	
	//Constructors
	public Truck() //Default
	{
		super(); //Accesses the Vehicle default constructor
		this.loadCap = 0.0;
		this.towCap = 0.0;
	}
	public Truck(String aManuName, int aCylinders, String aOwnersName, double aLoadCap, double aTowCap) //Parametrized
	{
		super(aManuName, aCylinders, aOwnersName); //Accesses the Vehicle parametrized constructor
		this.setLoadCap(aLoadCap);
		this.setTowCap(aTowCap);
	}
	
	//Accessors
	public double getLoadCap()
	{
		return this.loadCap;
	}
	public double getTowCap()
	{
		return this.towCap;
	}
	
	//Mutators
	public void setLoadCap(double aLoadCap)
	{
		if(aLoadCap > 0.0)
		{
			this.loadCap = aLoadCap;
		}
	}
	public void setTowCap(double aTowCap)
	{
		if(aTowCap > 0.0)
		{
			this.towCap = aTowCap;
		}
	}
	
	//Other methods
	public String toString()
	{
		return "Manufacturer's Name: "+super.getManuName()+"\nNumber Of Cylinders: "+super.getCylinders()+"\nOwner's Name: "+super.getOwnersName()+"\nLoad Capacity: "+this.loadCap+"\nTowing Capacity: "+this.towCap; 
	}
	public boolean equals(Truck aTruck)
	{
		return aTruck != null && this.loadCap == aTruck.getLoadCap() && this.towCap == aTruck.getTowCap() && super.equals(aTruck);
	}
}
