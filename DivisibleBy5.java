import java.util.Scanner;

class DivisibleBy5
{
	public static void main(String arg[])
	{	
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		num = sc.nextInt();
						
		if(num%5==0 && num%3==0)
		{
			System.out.print(num+" is devisible by 5 as well as 3" );
		}
		else if(num%5==0  ||   num%3==0)
		{
			System.out.print(num+" is devisible by 5 or 3" );
		} else
		{
			System.out.print(num+" is not divisible by 5 or 3" );
		}
		

		sc.close();
	}
}	