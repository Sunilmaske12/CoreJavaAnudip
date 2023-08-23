//Write  a Java program that reads a string input from the user. Convert the string to an integer using the Integer.parseInt() method. 
//Handle the NumberFormatException that can occur if the input cannot be parsed as an integer. Display a message indicating that the input is not a valid integer.

import java.util.*;

public class NumberFormateExceptionHandling
{
	public static void main(String[] arg)
	{
		try
		{
			System.out.println("Eneter a string");
			Scanner sc=new Scanner(System.in);
			String str = sc.next();
			int num = Integer.parseInt(str);
			System.out.println(num);
		}
		
		catch(NumberFormatException ex)
		{
			System.out.println(ex);
		}

		//execute regardless of exception occured or not
		finally
		{
			System.out.println("In a finally block");			
		}
			System.out.println("Remaining code block");
	}
}