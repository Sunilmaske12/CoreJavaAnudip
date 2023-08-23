//WAP to accept a set of any 10 characters. Calculate and print the sum of ASCII codes of the characters.
import java.util.*;


public class AsciValue2
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		char c1, c2;
		int sum=0, sum1=0;
		System.out.println("Enter 10 characters");
		for(int i=1; i<=10; i++)
		{
			c1=sc.next().charAt(0);
			sum = sum+(int)c1;
		}
		System.out.println("Sum is "+sum);

		System.out.println("\nEnter String of 10 characters without space");
		
		String str=sc.next();
		for(int i=0; i<10; i++)
		{
			sum1 = sum1+(int)str.charAt(i);
		}

		System.out.println("Sum is "+sum1);

	}
}