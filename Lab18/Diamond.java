/*
 * Written by Anvith Deeconda
 */
public class Diamond extends ShapeBasics implements DiamondInterface {

	private int width;
	
	public Diamond()
	{
		this.width = 0;
	}
	public Diamond(int aWidth, int offset)
	{
		super(offset);
		this.setWidth(aWidth);
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public void setWidth(int aWidth)
	{
		if(aWidth > 0 && aWidth % 2 == 1)
		{
			this.width = aWidth;
		}
	}

	public void drawHere() //This overrides the drawHere in ShapeBasic
	{
		//Draw Top V
		this.drawTopV();
		//Draw Bottom V
		this.drawBottomV();
	}
	private void drawTopV()
	{
	    int count1 = this.width/2 + super.getOffset();
	    int count2 = 1;
	    SkipSpaces(count1);
	    System.out.println("*");
	    count1--;
	    while(count1 >= super.getOffset())
	    {
	    		SkipSpaces(count1);
	    		System.out.print("*");
	    		SkipSpaces(count2);
	    		count2 += 2;
	    		System.out.println("*");
	    		count1--;
	    }
	}
	private void drawBottomV()
	{
		int count1 = 1 + super.getOffset();
		int count2 = (this.width - 4);
		while(count2 >= 1)
		{
			SkipSpaces(count1);
			System.out.print("*");
			SkipSpaces(count2);
			System.out.println("*");
			count1++;
			count2-=2;
		}
		SkipSpaces((this.width/2) + super.getOffset());
		System.out.println("*");
	}
	public static void SkipSpaces(int spaces)
	{
		for(int i=0;i<spaces;i++)
		{
			System.out.print(" ");
		}
	}
}
