import java.util.Scanner;

class NumberPNZ
{
	public static void main(String arg[])
	{	
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		num = sc.nextInt();
						
		if(num>0)
		{
			System.out.print(num+" is positive number" );
		}
		else if(num<0)
		{
			System.out.print(num+" is negative number" );
		}
		else 
		{
			System.out.print(num+" is zero " );
		}
		

		sc.close();
	}
}	