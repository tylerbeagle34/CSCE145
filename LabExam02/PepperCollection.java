/*
 * Written by Warren Beagle
 */
public class PepperCollection {

	private Pepper[] peppers; //Array of peppers
	public static final int MAX_PEPPERS = 10; //Max number of peppers
	
	//Constructors
	public PepperCollection() //Default
	{
		peppers = new Pepper[MAX_PEPPERS]; //Creates an array of 10 peppers
	}
	
	//Accessors
	public Pepper[] getPeppers()
	{
		return this.peppers;
	}
	
	public void addPepper(Pepper aPepper) //Add pepper method
	{
		for(int i = 0; i < peppers.length; i++)
		{
			if(peppers[i] == null)
			{
				peppers[i] = aPepper;
				return;
			}
		}
		System.out.println("The max number of peppers has been reached!");
	}
	public void sortPeppers() //Sorts the peppers from hottest to mildest based on the Scoville Rating
	{
		boolean whileSort = true;
		while(whileSort)
		{
			whileSort = false;
			for(int i = 0; i < peppers.length - 1; i++)
			{
				if(peppers[i+1] == null)
				{
					break; //Breaks if there is no pepper in that position
				}
				else if(peppers[i].getScovilleRating() < peppers[i+1].getScovilleRating())
				{
					Pepper temp = peppers[i]; //Sorts the peppers
					peppers[i] = peppers[i+1];
					peppers[i+1] = temp;
					whileSort = true;
				}
			}
		}
	}
	public void printPeppers() //print the peppers method
	{
		for(int i = 0; i < peppers.length; i++)
		{
			if(peppers[i] == null)
			{
				break;
			}
			else
			{
				System.out.println(peppers[i]); //Prints the pepper at position i
			}
		}
	}
}
