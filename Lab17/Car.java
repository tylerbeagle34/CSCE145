/*
 * Written by Warren Beagle
 */
public class Car extends Vehicle {
	
	//Instance Variables
	private double mileage;
	private int passengers;
	
	//Constructors
	public Car() //Default
	{
		super(); //Accesses the Vehicle default constructor
		this.mileage = 0.0;
		this.passengers = 0;
	}
	public Car(String aManuName, int aCylinders, String aOwnersName, double aMileage, int aPassengers) //Parametrized
	{
		super(aManuName, aCylinders, aOwnersName); //Accesses the Car parametrized constructor
		this.setMileage(aMileage);
		this.setPassengers(aPassengers);
	}
	
	//Accessors
	public double getMileage()
	{
		return this.mileage;
	}
	public double getPassengers()
	{
		return this.passengers;
	}
	
	//Mutators
	public void setMileage(double aMileage)
	{
		if(aMileage > 0.0)
		{
			this.mileage = aMileage;
		}
	}
	public void setPassengers(int aPassengers)
	{
		if(aPassengers > 0)
		{
			this.passengers = aPassengers;
		}
	}
	
	//Other methods
	public String toString()
	{
		return "Manufacturer's Name: "+super.getManuName()+"\nNumber Of Cylinders: "+super.getCylinders()+"\nOwner's Name: "+super.getOwnersName()+"\nGas Mileage: "+this.mileage+"\nNumber Of Passengers: "+this.passengers; 
	}
	public boolean equals(Car aCar)
	{
		return aCar != null && this.mileage == aCar.getMileage() && this.passengers == aCar.getPassengers() && super.equals(aCar);
	}

}
