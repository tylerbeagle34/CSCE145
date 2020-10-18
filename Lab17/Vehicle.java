/*
 * Written by Warren Beagle
 */
public class Vehicle {
	
	//Instance Variables
	private String manuName;
	private int cylinders;
	private String ownersName;
	
	//Constructors
	public Vehicle() //Default
	{
		this.manuName = "No manufacturer yet";
		this.cylinders = 0;
		this.ownersName = "No owner yet";
	}
	public Vehicle(String aManuName, int aCylinders, String aOwnersName) //Parametrized
	{
		this.setManuName(aManuName);
		this.setCylinders(aCylinders);
		this.setOwnersName(aOwnersName);
	}
	
	//Accessors
	public String getManuName()
	{
		return this.manuName;
	}
	public int getCylinders()
	{
		return this.cylinders;
	}
	public String getOwnersName()
	{
		return this.ownersName;
	}
	
	//Mutators
	public void setManuName(String aManuName)
	{
		this.manuName = aManuName;
	}
	public void setCylinders(int aCylinders)
	{
		if(aCylinders > 0)
		{
			this.cylinders = aCylinders;
		}
	}
	public void setOwnersName(String aOwnersName)
	{
		this.ownersName = aOwnersName;
	}
	
	//Other methods
	public String toString()
	{
		return "Manufacturer's Name: "+this.manuName+"\nNumber Of Cylinders: "+this.cylinders+"\nOwner's Name: "+this.ownersName;
	}
	public boolean equals(Vehicle aV)
	{
		return aV != null && this.manuName.equals(aV.getManuName()) && this.cylinders == aV.getCylinders() && this.ownersName.equals(aV.getOwnersName());
	} 
}
