
public class Taco {
	private String name;
	private String location;
	private double price;
	
	public Taco() //Default
	{
		this.name = "No name yet";
		this.location = "No location yet";
		this.price = 0.0;
	}
	public Taco(String aName, String aLocation, double aPrice)
	{
		this.setName(aName);
		this.setLocation(aLocation);
		this.setPrice(aPrice);
	}
	public String getName()
	{
		return this.name;
	}
	
	public String getLocation()
	{
		return this.location;
	}
	public double getPrice()
	{
		return this.price;
	}
	
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setLocation(String aLocation)
	{
		this.location = aLocation;
	}
	public void setPrice(double aPrice)
	{
		if(aPrice >= 0.0)
		{
			this.price = aPrice;
		}
	}
	
	public String toString()
	{
		return this.name+" "+this.location+" "+this.price;
	}
	public boolean equals(Taco aTaco)
	{
		return aTaco != null && this.name.equals(aTaco.getName()) && this.location.equals(aTaco.getLocation()) && this.price == aTaco.getPrice();
	}
}
