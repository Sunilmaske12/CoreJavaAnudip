
import java.util.Scanner;

class MarksDivision
{
	public static void main(String arg[])
	{	
		int num1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your percentage :");
		num1 = sc.nextInt();
		if(num1>=75)
		{
			System.out.println("  distinction");
		}
		else if(75>num1 && num1>=60)
		{
			System.out.println(" First Class");
		}
		else if(60>num1 && num1>=45)
		{
			System.out.println(" Second Class");
		}
		else if(45>num1 && num1>=35)
		{
			System.out.println(" Just Pass");
		}
		else{
			System.out.println(" Fail");
		}
		sc.close();
	}
}	