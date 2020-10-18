/*
 * Written by Warren Beagle
 */
public class DimensionException extends Exception {

	public DimensionException()
	{
		super("Dimensions must be of length one at least"); //Make sure you put an error message in here
	}
	public DimensionException(String aMsg)
	{
		super(aMsg);
	}
}
