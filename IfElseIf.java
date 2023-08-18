/* 
	if(test condition)
	{
		body of the code
	}
	else if(test condition)
	{
		body of the code
	}

	else
	{
		code ...
	}	*/

import java.util.Scanner;

class IfElseIf
{
	public static void main(String arg[])
	{	
		int num1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		num1 = sc.nextInt();
		if(num1>50 && num1<=100)
		{
			System.out.println(" you entered value greater than 50");
		}
		else if(num1>100)
		{
			System.out.println(" you entered value greater than 100");
		}
		else 
		{
			System.out.println(" you entered value less than 50");
		}
		sc.close();
	}
}	