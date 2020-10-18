enum PetType{cat, dog, hamster, armadillo, turkey, owl, abomination}
public class Pet {
	//Instance variables
	private String name;
	private double weight;
	private int age;
	private PetType type;
	
	//Contructors
	public Pet()
	{
		this.name = "No name yet";
		this.weight = 0.0;
		this.age = 0;
		this.type = PetType.abomination;
	}
	public Pet(String aName, double aWeight, int anAge, PetType aType) //Parametrized
	{
		//fill in with mutators
		this.setName(aName);
		this.setWeight(aWeight);
		this.setAge(anAge);
		this.setType(aType);
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
	public int getAge()
	{
		return this.age;
	}
	public PetType getType()
	{
		return this.type;
	}
	
	//Mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setWeight(double aWeight)
	{
		if(aWeight >= 0.0)
		{
			this.weight = aWeight;
		}
	}
	public void setAge(int anAge)
	{
		if(anAge >= 0)
		{
			this.age = anAge;
		}
	}
	public void setType(PetType aType)
	{
		this.type = aType;
	}
	
	//Other methods
	public String toString()
	{
		return this.name+" "+this.weight+" "+this.age+" "+this.type;
	}
	public boolean equals(Pet aPet)
	{
		return aPet != null && aPet.getName().equals(this.name) && aPet.getAge() == this.age && aPet.getWeight() == this.weight && aPet.getType() == this.type;
	}
	public static Pet createNewPet(PetType aType)
	{
		Pet newPet = new Pet();
		newPet.setType(aType);
		return newPet;
	}
	public static Pet breed(Pet pet01, Pet pet02)
	{
		if(pet01.getType() == pet02.getType())
		{
			return createNewPet(pet01.getType());
		}
		else
		{
			System.out.println("Stop");
			return null;
		}
	}
	public static Pet splice(Pet pet01, Pet pet02)
	{
		if(pet01.getType() == pet02.getType())
		{
			System.out.println("That's boring");
			return createNewPet(pet01.getType());
		}
		else
		{
			System.out.println("Committing and act");
			System.out.println("A part "+pet01.getType()+" and part "+pet02.getType());
			return createNewPet(PetType.abomination);
		}
	}
	public static Pet splice(Pet[] petArr) //Overloads method
	{
		if(petArr == null)
		{
			return null;
		}
		System.out.println("You are creating something against nature");
		System.out.println("A Part ");
		/*for(int i = 0; i < petArr.length; i++)
		{
			System.out.print(petArr[i].getType()+" ");
		}*/
		for(Pet pet : petArr) //For each loop
		{
			System.out.print(pet.getType()+" ");
		}
		System.out.println();
		return createNewPet(PetType.abomination);
	}
}