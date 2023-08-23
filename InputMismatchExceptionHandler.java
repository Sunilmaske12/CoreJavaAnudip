//Write a Java program that reads an integer from the user using the Scanner class. Handle the InputMismatchException that can occur if the user 
//enters a non-integer value. Display an appropriate error message.

import java.util.*;

public class InputMismatchExceptionHandler
{
	public static void main(String[] arg)
	{
		try
		{
			System.out.println("Eneter a number");
			Scanner sc=new Scanner(System.in);
			Integer num = sc.nextInt();

			System.out.println(num*num);
		}
		
		catch(InputMismatchException ex)
		{
			System.out.println(ex);
		}

		//execute regardless of exception occured or not
		finally
		{
			System.out.println("In a finally block");			
			System.out.println("the expected input must be integer type");
		}
			System.out.println("Remaining code block");
	}
}