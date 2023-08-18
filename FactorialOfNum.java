// checking Armstrong number fro 3digit number
import java.util.Scanner;

class FactorialOfNum
{
	public static void main(String arg[])
	{
		int  num, fact=1;
		Scanner sc=new Scanner(System.in);		
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		while(num>0)
		{	
			fact = fact*num;
			num--;
		}
		System.out.print("Factorial of a number is : "+fact);
	}
}