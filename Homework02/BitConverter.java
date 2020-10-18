/*
 * Written by Warren Beagle
 */
import java.util.Scanner;
public class BitConverter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter an 8-bit binary number and I will convert it to a decimal");
		Scanner keyboard = new Scanner(System.in);
		String bit = keyboard.nextLine();
		
		double bit1 = ((bit.charAt(0))-48)*Math.pow(2, 7);
		double bit2 = ((bit.charAt(1))-48)*Math.pow(2, 6);
		double bit3 = ((bit.charAt(2))-48)*Math.pow(2, 5);
		double bit4 = ((bit.charAt(3))-48)*Math.pow(2, 4);
		double bit5 = ((bit.charAt(4))-48)*Math.pow(2, 3);
		double bit6 = ((bit.charAt(5))-48)*Math.pow(2, 2);
		double bit7 = ((bit.charAt(6))-48)*Math.pow(2, 1);
		double bit8 = ((bit.charAt(7))-48)*Math.pow(2, 0);
		
		System.out.println(bit+" in decimal form is "+(bit1+bit2+bit3+bit4+bit5+bit6+bit7+bit8));
	}

}
