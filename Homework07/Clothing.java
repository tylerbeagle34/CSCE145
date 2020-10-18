/*
 * Written by Warren Beagle
 */
public class Clothing {

	//Instance Variables
	private String type;
	private String color;
	
	//Constructors
	public Clothing() //Default
	{
		this.type = "no type yet";
		this.color = "no color yet";
	}
	public Clothing(String aType, String aColor) //Parametrized
	{
		//fill in with mutators
		this.setType(aType);
		this.setColor(aColor);
	}
	
	//Accessors
	public String getType()
	{
		return this.type;
	}
	public String getColor()
	{
		return this.color;
	}
		
	//Mutators
	public void setType(String aType)
	{
		if(aType.equalsIgnoreCase("undergarment") || aType.equalsIgnoreCase("socks") || aType.equalsIgnoreCase("stockings")
				|| aType.equalsIgnoreCase("top") || aType.equalsIgnoreCase("bottom") || aType.equalsIgnoreCase("cape"))
		{
			this.type = aType;
		}
		else
		{
			System.out.print("Invalid clothing type");
			this.type = null;
		}
	}
	public void setColor(String aColor)
	{
		if(aColor.equalsIgnoreCase("brown") || aColor.equalsIgnoreCase("red") || aColor.equalsIgnoreCase("pink") || aColor.equalsIgnoreCase("orange")
				|| aColor.equalsIgnoreCase("blue") || aColor.equalsIgnoreCase("green") || aColor.equalsIgnoreCase("purple") || aColor.equalsIgnoreCase("grey"))
		{
			this.color = aColor;
		}
		else
		{
			System.out.println("Invalid clothing color");
			this.color = null;
		}
	}
	
	//Other methods
	public String toString()
	{
		return this.type+" "+this.color;
	}
	public boolean equals(Clothing aClothing)
	{
		return aClothing != null && this.type.equals(aClothing.getType()) && this.color.equals(aClothing.getColor());
	}
}
