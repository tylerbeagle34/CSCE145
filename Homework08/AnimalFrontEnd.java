/*
 * Written by Warren Beagle
 */
import java.util.Scanner;
public class AnimalFrontEnd 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Animal animal;
		AnimalCollection animalCollection = new AnimalCollection();
		System.out.println("Welcome to the Cat and Dog Collection");
		boolean quit = false;
		while(!quit) //Runs until the user quits
		{
			animal = new Animal(); //Creates a new animal
			System.out.println("\nWould you like to:\n" + //Prompts the user
					"1. Add a cat or dog\n" +
					"2. Remove a cat or dog\n" +
					"3. Quit\n");
			int pick = keyboard.nextInt(); //User input
			keyboard.nextLine();
			switch(pick)
			{
			case 1: //Add animal
				System.out.println("Would you like to add a 1. House Cat, 2. A Leopard, 3. A Domestic Dog, or 4. A wolf"); //Prompt user
				int choice = keyboard.nextInt(); //user input
				keyboard.nextLine();
				while(choice != 1 && choice != 2 && choice != 3 && choice != 4)
				{
					System.out.println("Invalid choice pick again");
					pick = keyboard.nextInt();
					keyboard.nextLine();
				}
				switch(choice)
				{
				case 1: //Add house cat
					System.out.println("Enter the house cat's name, weight, mood, and type"); //Prompts the user
					animal.setName(keyboard.nextLine()); //User input
					animal.setWeight(keyboard.nextDouble());
					keyboard.nextLine();
					String mood1 = keyboard.nextLine();
					String type = keyboard.nextLine();
					animal = new HouseCat(animal.getName(), animal.getWeight(), mood1, type); //creates new animal (house cat) with the input attributes
					animalCollection.addAnimal(animal); //Adds house cat to the collection
					break;
				case 2:
					System.out.println("Enter the leopard's name, weight, mood, and number of spots"); //Prompts user 
					animal.setName(keyboard.nextLine()); //User input
					animal.setWeight(keyboard.nextDouble());
					keyboard.nextLine();
					String mood2 = keyboard.nextLine();
					int spots = keyboard.nextInt();
					keyboard.nextLine();
					animal = new Leopard(animal.getName(), animal.getWeight(), mood2, spots); //creates new animal (leopard) with the input attributes
					animalCollection.addAnimal(animal); //Adds leopard to the collection
					break;
				case 3:
					System.out.println("Enter the domestic dog's name, weight, energy level, and type"); //Prompts the user 
					animal.setName(keyboard.nextLine()); //User input
					animal.setWeight(keyboard.nextDouble());
					int energyLevel1 = keyboard.nextInt();
					keyboard.nextLine();
					String type2 = keyboard.nextLine();
					animal = new DomesticDog(animal.getName(), animal.getWeight(), energyLevel1, type2); //creates new animal (domestic dog) with the input attributes
					animalCollection.addAnimal(animal); //adds the domestic dog to the collection
					break;
				case 4:
					System.out.println("Enter the wolf's name, weight, energy level, and pack leader"); //prompts the user 
					animal.setName(keyboard.nextLine()); //user inputs
					animal.setWeight(keyboard.nextDouble());
					int energyLevel2 = keyboard.nextInt();
					keyboard.nextLine();
					String packLeader = keyboard.nextLine();
					animal = new DomesticDog(animal.getName(), animal.getWeight(), energyLevel2, packLeader); //creates new animal (wolf) with the input attributes
					animalCollection.addAnimal(animal); //adds wolf to the collection
					break;
				}
				System.out.println("Current Collection: ");
				animalCollection.printAnimals(animal); //Prints the collection
				break;
			case 2: //Remove animal
				System.out.println("Enter the name of the animal to remove"); //prompts the user 
				animal.setName(keyboard.nextLine()); //user input
				animalCollection.removeAnimal(animal.getName()); //removes the animal with name = input
				System.out.println("Current Collection: ");
				animalCollection.printAnimals(animal); //Prints the collection
				break;
			case 3: //Exits
				quit = true;
				break;
			default:
				System.out.println("Invalid input");
			}
		}
		System.out.println("Goodbye");
	}
}