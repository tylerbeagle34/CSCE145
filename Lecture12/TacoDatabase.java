
public class TacoDatabase {
	private Taco[] tacos;
	public static final int DEFAULT_SIZE = 100;
	
	public TacoDatabase()
	{
		tacos = new Taco[DEFAULT_SIZE];
	}
	public TacoDatabase(int size)
	{
		if(size > 0)
		{
			tacos = new Taco[size];
		}
	}
	
	public Taco[] getTacos()
	{
		return this.tacos;
	}
	
	//NO MUTATORS
	
	public void printTacos()
	{
		for(int i = 0; i < tacos.length; i++)
		{
			if(tacos[i] == null)
			{
				break;
			}
			else
			{
				System.out.println(tacos[i]);
			}
		}
	}
	//Only adding new tacos to the end of the array
	//Making sure I have no gaps in the array
	public void addTaco(Taco aTaco)
	{
		if(tacos[tacos.length - 1] != null)
		{
			System.out.println("The array is full");
			return;
		}
		for(int i = 0; i < tacos.length; i++)
		{
			if(tacos[i] == null)
			{
				tacos[i] = aTaco;
				break;
			}
		}
	}
	public void removeATaco(String aTacoName)
	{
		int removeIndex = -1;
		for(int i = 0; i < tacos.length; i++)
		{
			if(tacos[i] != null && tacos[i].getName().equals(aTacoName))
			{
				removeIndex = i;
				break;
			}
		}
		if(removeIndex == -1)
		{
			System.out.println("Taco not found");
		}
		else
		{
			for(int i = removeIndex; i < tacos.length - 1; i++)
			{
				tacos[i] = tacos[i+1];
			}
			tacos[tacos.length - 1] = null;
		}
	}
}
