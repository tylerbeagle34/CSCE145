/*
 * Written by Warren Beagle
 */
public class Concert {
	//Attributes of instance variables
			private String name;
			private int capacity;
			private int numberOfTicketsSoldByPhone;
			private int numberOfTicketsSoldByVenue;
			private double priceOfPhoneTickets;
			private double priceOfVenueTickets;
			
			//Constructor
			public Concert()
			{
				this.name = "no name";
				this.capacity = 0;
				this.numberOfTicketsSoldByPhone = 0;
				this.numberOfTicketsSoldByVenue = 0;
				this.priceOfPhoneTickets = 0.0;
				this.priceOfVenueTickets = 0.0;
			}
			public Concert(String aName, int aCapacity, double aPriceByPhone, double aPriceAtVenue)
			{
				this.setName(aName);
				this.setCapacity(aCapacity);
				this.setPriceByPhone(aPriceByPhone);
				this.setPriceAtVenue(aPriceAtVenue);
			}
			public Concert(String aName, int aCapacity, int aNumberOfTicketsSoldByPhone, int aNumberOfTicketsSoldByVenue, double aPriceByPhone, double aPriceAtVenue)
			{
				this.setName(aName);
				this.setCapacity(aCapacity);
				this.setNumberOfTicketsSoldByPhone(aNumberOfTicketsSoldByPhone);
				this.setNumberOfTicketsSoldByVenue(aNumberOfTicketsSoldByVenue);
				this.setPriceByPhone(aPriceByPhone);
				this.setPriceAtVenue(aPriceAtVenue);
			}
			
			//Accessors
			public String getName()
			{
				return this.name;
			}
			public int getCapacity()
			{
				return this.capacity;
			}
			public int getNumberOfTicketsSoldByPhone()
			{
				return this.numberOfTicketsSoldByPhone;
			}
			public int getNumberOfTicketsSoldAtVenue()
			{
				return this.numberOfTicketsSoldByVenue;
			}
			public double getPriceByPhone()
			{
				return this.priceOfPhoneTickets;
			}
			public double getPriceAtVenue()
			{
				return this.priceOfVenueTickets;
			}
			//Mutators
			public void setName(String aName)
			{
				this.name = aName;
			}
			public void setCapacity(int aCapacity)
			{
				if(aCapacity > 0)
				{
					this.capacity = aCapacity;
				}
				else
				{
					System.out.println("Invalid Capacity");
				}
			}
			public void setNumberOfTicketsSoldByPhone(int aNumberOfTicketsSoldByPhone)
			{
				if(aNumberOfTicketsSoldByPhone >= 0)
				{
					this.numberOfTicketsSoldByPhone = aNumberOfTicketsSoldByPhone;
				}
				else
				{
					System.out.println("Invalid Number of Tickets");
				}	
			}
			public void setNumberOfTicketsSoldByVenue(int aNumberOfTicketsSoldByVenue)
			{
				if(aNumberOfTicketsSoldByVenue >= 0)
				{
					this.numberOfTicketsSoldByVenue = aNumberOfTicketsSoldByVenue;
				}
				else
				{
					System.out.println("Invalid Number of Tickets");
				}
			}
			public void setPriceByPhone(double aPriceByPhone)
			{
				if(aPriceByPhone >= 0.0)
				{
					this.priceOfPhoneTickets = aPriceByPhone;
				}
				else
				{
					System.out.println("Invalid Price");
				}
			}
			public void setPriceAtVenue(double aPriceAtVenue)
			{
				if(aPriceAtVenue >= 0.0)
				{
					this.priceOfVenueTickets = aPriceAtVenue;
				}
				else
				{
					System.out.println("Invalid Price");
				}
			}
			//Other methods
			public int TotalNumberOfTicketsSold()
			{
				return this.numberOfTicketsSoldByPhone + this.numberOfTicketsSoldByVenue;
			}
			public int TicketsRemaining()
			{
				return capacity - TotalNumberOfTicketsSold();
			}
		    public void BuyTicketsByPhone(int numberOfTicketsSoldByPhone)
			{
				if(numberOfTicketsSoldByPhone <= capacity)
				{
					this.numberOfTicketsSoldByPhone += numberOfTicketsSoldByPhone;
				}
			}
			public void BuyTicketsAtVenue(int numberOfTicketsSoldByVenue)
			{
				if(numberOfTicketsSoldByVenue <= capacity)
				{
					this.numberOfTicketsSoldByVenue += numberOfTicketsSoldByVenue;
				}
			}
			public double TotalSales()
			{
				return (priceOfVenueTickets * numberOfTicketsSoldByVenue) + (priceOfPhoneTickets * numberOfTicketsSoldByPhone);
			}
}
