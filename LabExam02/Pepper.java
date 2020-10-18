/*
 * Written by Warren Beagle
 */
public class Pepper {

	//Instance variables
	private String name;
	private int scovilleRating;
	
	//Constructors
	public Pepper() //Default
	{
		this.name = "false";
		this.scovilleRating = 0;
	}
	public Pepper(String aName, int aScovilleRating) //Parameterized
	{
		this.setName(aName);
		this.setScovilleRating(aScovilleRating);
	}
	
	//Accessors
	public String getName()
	{
		return this.name;
	}
	public int getScovilleRating()
	{
		return this.scovilleRating;
	}
	
	//Mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setScovilleRating(int aScovilleRating)
	{
		if(aScovilleRating >= 0 && aScovilleRating <= 2200000) //Scoville rating must be >= 0 and <= 2.2million
		{
			this.scovilleRating = aScovilleRating;
		}
	}
	
	//Other methods
	public String toString()
	{
		return this.name+" "+this.scovilleRating;
	}
}
