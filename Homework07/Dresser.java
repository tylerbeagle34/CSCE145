/*
 * Written by Warren Beagle
 */
public class Dresser {

	//Instance variables
	private Clothing[][] clothes;
	public static final int DRAWERS = 5;
	public static final int DRAWER_SIZE = 10;
	
	//Constructor
	public Dresser() //Default
	{
		clothes = new Clothing[DRAWERS][DRAWER_SIZE];
	}
	
	//NO ACCESSORS OR MUTATORS
	
	//Other methods
	public void add(Clothing aClothing) //Add clothing method
	{
		for(int i = 0; i < DRAWERS; i++)
		{
			if(clothes[i][DRAWER_SIZE - 1] != null) //Check to see if drawer is full
			{
				System.out.print("This drawer is full");
				return;
			}
			if((aClothing.getType().equalsIgnoreCase("undergarment") && aClothing.getColor() != null) && i == 0) //Undergarments
			{
				for(int j = 0; j < DRAWER_SIZE; j++)
				{
					if(clothes[i][j] == null)
					{
						clothes[i][j] = aClothing;
						break;
					}
				}
			}
			if(((aClothing.getType().equalsIgnoreCase("socks") || aClothing.getType().equalsIgnoreCase("stockings")) && aClothing.getColor() != null) && i == 1) //Socks
			{
				for(int j = 0; j < DRAWER_SIZE; j++)
				{
					if(clothes[i][j] == null)
					{
						clothes[i][j] = aClothing;
						break;
					}
				}
			}
			if((aClothing.getType().equalsIgnoreCase("top") && aClothing.getColor() != null) && i == 2) //Tops
			{
				for(int j = 0; j < DRAWER_SIZE; j++)
				{
					if(clothes[i][j] == null)
					{
						clothes[i][j] = aClothing;
						break;
					}
				}
			}
			if((aClothing.getType().equalsIgnoreCase("bottom") && aClothing.getColor() != null) && i == 3) //Bottoms
			{
				for(int j = 0; j < DRAWER_SIZE; j++)
				{
					if(clothes[i][j] == null)
					{
						clothes[i][j] = aClothing;
						break;
					}
				}
			}
			if((aClothing.getType().equalsIgnoreCase("cape") && aClothing.getColor() != null) && i == 4) //Capes
			{
				for(int j = 0; j < DRAWER_SIZE; j++)
				{
					if(clothes[i][j] == null)
					{
						clothes[i][j] = aClothing;
						break;
					}
				}
			}
		}
	}
	public void remove(String aClothingType, String aClothingColor) //Remove an item of clothing
	{
		int removeIndex = -1;
		for(int i = 0; i < DRAWERS; i++)
		{
			for(int j = 0; j < DRAWER_SIZE; j++)
			{
				if(clothes[i][j] != null && clothes[i][j].getType().equalsIgnoreCase(aClothingType) && clothes[i][j].getColor().equalsIgnoreCase(aClothingColor)) //Finds clothing
				{
					removeIndex = j;
					break;
				}
			}
		}
		if(removeIndex == -1)
		{
			System.out.println("Item of clothing not found");
		}
		else
		{
			for(int i = 0; i < DRAWERS; i++)
			{
				for(int j = removeIndex; j < DRAWER_SIZE - 1; j++)
				{
					clothes[i][j] = clothes[i][j+1]; //Removes item of clothing
				}
				clothes[i][DRAWER_SIZE-1] = null;
			}
		}
	}
	public void print() //Prints the drawers
	{
		for(int i = 0; i < DRAWERS; i++)
		{
			System.out.println("Drawer "+i);
			for(int j = 0; j < DRAWER_SIZE; j++)
			{
				if(clothes[i][j] == null)
				{
					break;
				}
				else
				{
					System.out.println(clothes[i][j]);
				}
			}
		}
	}
}
