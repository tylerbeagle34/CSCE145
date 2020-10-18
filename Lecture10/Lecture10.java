
public class Lecture10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String cat01Name = "Mr. Flufferkins";
		double cat01Weight = 20.0;
		int cat01NumberOfLegs = 4;
		
		String cat02Name = "Roscoe the Wondercat";
		double cat02Weight = 10.0;
		int cat02NumberOfLegs = 4;*/
		
		Cat cat01 = new Cat();
		cat01.setName("Mr Flufferkins");
		cat01.setWeight(20.0);
		cat01.setNumberOfLegs(4);
		System.out.println(cat01.getName());
		
		Cat cat02 = new Cat ("Roscoe", 10.0, 4);
		/*Cat cat02 = new Cat();
		cat02.setName("Roscoe the Wondercat");
		cat02.setWeight(10.0);
		cat02.setNumberOfLegs(4);*/
		System.out.println(cat02);
		
		System.out.println(cat01.equals(cat02));
	}

}
