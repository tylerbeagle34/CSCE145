/*
 * Written by Warren Beagle
 */
public class AnimalCollection {

	private Animal[] animals; //Array of animals
	public static final int MAX_ANIMALS = 100;
	
	//Constructors
	public AnimalCollection() //Default
	{
		animals = new Animal[MAX_ANIMALS];
	}
	
	//Accessors
	public Animal[] getAnimals()
	{
		return this.animals;
	}
	
	public void addAnimal(Animal anAnimal) //Add animal method
	{
		for(int i = 0; i < animals.length; i++)
		{
			if(animals[i] == null)
			{
				animals[i] = anAnimal;
				return;
			}
		}
		System.out.println("The max number of animals has been reached!");
	}
	public void removeAnimal(String anAnimalName) //remove animal method
	{
		int removeIndex = -1;
		for(int i = 0; i < animals.length; i++)
		{
			if(animals[i] != null && animals[i].getName().equals(anAnimalName))
			{
				removeIndex = i;
				break;
			}
		}
		if(removeIndex == -1)
		{
			System.out.println("Animal not found");
		}
		else
		{
			for(int i = removeIndex; i < animals.length - 1; i++)
			{
				animals[i] = animals[i+1];
			}
			animals[animals.length - 1] = null;
		}
	}
	public void printAnimals(Animal anAnimal) //print the animals method
	{
		for(int i = 0; i < animals.length; i++)
		{
			if(animals[i] == null)
			{
				break;
			}
			else
			{
				System.out.println(animals[i]);
			}
		}
	}
}
