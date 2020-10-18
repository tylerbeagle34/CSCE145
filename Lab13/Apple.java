/*
 * Written by Warren Beagle
 */
public class Apple {
	//Attributes of instance variables
		private String type;
		private double weight;
		private double price;
		
		//Constructor
		public Apple()
		{
			this.type = "Gala";
			this.weight = 0.5;
			this.price = 0.89;
		}
		public Apple(String aType, double aWeight, double aPrice)
		{
			this.type = "Gala";
			this.weight = 0.5;
			this.price = 0.89;
			
			this.setType(aType);
			this.setWeight(aWeight);
			this.setPrice(aPrice);
		}
		
		//Accessors
		public String getType()
		{
			return this.type;
		}
		public double getWeight()
		{
			return this.weight;
		}
		public double getPrice()
		{
			return this.price;
		}
		//Mutators
		public void setType(String aType)
		{
			if(aType.equalsIgnoreCase("Red Delicious") || aType.equalsIgnoreCase("Golden Delicious") || aType.equalsIgnoreCase("Gala") || aType.equalsIgnoreCase("Granny Smith"))
			{
				this.type = aType;
			}
			else
			{
				System.out.println("Invalid Name");
			}
		}
		public void setWeight(double aWeight)
		{
			if(aWeight > 0 && aWeight < 2)
			{
				this.weight = aWeight;
			}
			else
			{
				System.out.println("Invalid Weight");
			}
		}
		public void setPrice(double aPrice)
		{
			if(aPrice >= 0)
			{
				this.price = aPrice;
			}
			else
			{
				System.out.println("Invalid Price");
			}	
		}
		//Other methods
		public String toString()
		{
			return "Name: "+this.type+" Weight: "+this.weight+" Price: "+this.price;
		}
		public boolean equals(Apple aApple)
		{
			return aApple != null && this.type.equals(aApple.getType()) && this.weight == aApple.getWeight() && this.price == aApple.getPrice();
		}
}
