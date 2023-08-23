//WAP to input set of N  characters. Find and display the number of uppercase and lowercase charachers.Assume that none of the 
//character is digit or a special character\
import java.util.*;

public class CountCases
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int upp=0, low=0, n;
		char c1;
		System.out.println("How many character you want to input ? :");
		n=sc.nextInt();
		System.out.println("Enter "+n+" characters :");
		for(int i=1; i<=n; i++)
		{
			c1=sc.next().charAt(0);
			if(Character.isLowerCase(c1))
			{
			 low++;	
			}
			if(Character.isUpperCase(c1))
			{
			 upp++;
			}
		}
		System.out.println("Upper case is "+upp);
		System.out.println("Lower case is "+low);

		

	}
}