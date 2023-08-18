//Q.1)Check whether the user input number is prime number 
import java.util.Scanner;
class CheckPrimeNum
{
	public static void main(String []arg)
	{
		boolean isPrime=true;
		int num;
		Scanner sc=new Scanner(System.in);	
		System.out.print("Enter a number: ");	
		num=sc.nextInt();	
		
		for(int i=num-1; i>1; i--)
		{
			if(num%i==0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime==true)
		{
			System.out.print(num+" is a prime number ");
		}		
		else
				{
			System.out.print(num+" is not a prime number ");
		}		
		
	}
}

