
public class ShapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeInterface[] shapes = new ShapeInterface[3];
		
		//shapes[0] = new ShapeInterface(); //You CANNOT do this; interfaces don't have constructors
		shapes[0] = new ShapeBasic();
		shapes[1] = new Rectangle(2,3);
		shapes[2] = new Rectangle(4,5);
		
		for(int i = 0; i < shapes.length; i++)
		{
			shapes[i].drawAt(i);
		}
	}

}
