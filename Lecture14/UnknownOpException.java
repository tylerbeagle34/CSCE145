
public class UnknownOpException extends Exception {
	
	public UnknownOpException()
	{
		super("Unknown operation was used"); //Make sure you put an error message in here
	}
	public UnknownOpException(String aMsg)
	{
		super(aMsg);
	}

}
