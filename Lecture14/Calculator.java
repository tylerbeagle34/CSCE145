
public class Calculator {

	private double result;
	private double precision = 0.0001;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator clerk = new Calculator();
		
		//TODO Try
		System.out.println("Calculator is on.");
		System.out.print("Format of each line: ");
		System.out.println("operator space number");
		System.out.println("For example: + 3");
		System.out.print("To end, enter the letter e");
		
		try
		{
			clerk.doCalculation();
		}
		catch(UnknownOpException e)
		{
			System.out.println(e);
		}
		catch(DivideByZero e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//TODO Catches
		public double evaluate(char op, double n1, double n2) throws UnknownOpException, DivideByZero
		{
			double answer = 0;
			switch(op)
			{
				default:
					throw new UnknownOpException();
			}
		}
	}

}
