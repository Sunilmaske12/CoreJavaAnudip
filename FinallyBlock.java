public class FinallyBlock
{
	public static void main(String[] arg)
	{
		try
		{
			System.out.println("Inside try block");
			
			int data = 12/0;

			System.out.println(data);
		}
		
			// cannot handle arithematic type exception
			//can only accept null pointer type exception
		catch(NullPointerException e)
		{
			System.out.println(e);
		}

		//execute regardless of exception occured or not
		finally
		{
			System.out.println("In a finally block");			
			System.out.println("this is compullasory executed block errespective exception");
		}
			System.out.println("Remaining code block");
	}
}