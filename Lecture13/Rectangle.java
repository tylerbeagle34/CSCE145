
public class Rectangle extends ShapeBasic implements RectangleInterface{

	private int height;
	private int width;
	
	public Rectangle()
	{
		this.height = 1;
		this.width = 1;
	}
	public Rectangle(int aHeight, int aWidth)
	{
		this.set(aHeight, aWidth);
	}
	
	public void set(int aHeight, int aWidth)
	{
		if(aHeight >= 1 && aWidth >= 1)
		{
			this.height = aHeight;
			this.width = aWidth;
		}
		else
		{
			this.height = this.width = 1;
		}
	}
	
	public void drawHere() //This overrides the drawHere in ShapeBasic
	{
		//Top line
		this.drawHorizontalLine();
		//Draw middle
		for(int i = 0; i < this.height; i++)
		{
			for(int j = 0; j < super.getOffset(); j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 0; j < this.width - 2; j++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
		//Bottom line
		this.drawHorizontalLine();
	}
	
	private void drawHorizontalLine()
	{
		for(int i = 0; i < super.getOffset(); i++)
		{
			System.out.print(" ");
		}
		for(int i = 0; i < this.width; i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
