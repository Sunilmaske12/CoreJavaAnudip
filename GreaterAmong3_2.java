import java.util.Scanner;

class GreaterAmong3_2
{
	public static void main(String arg[])
	{	
		int num1, num2, num3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 3 numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
						
		if(num1>num2 && num1>num3)
		{
			System.out.print(num1+" is greater number" );
		}
		else if(num2>num3)
		{
			System.out.print(num2+" is greater number" );
		}
		else 
		{
			System.out.print(num3+" is greater number" );
		}
		

		sc.close();
	}
}	