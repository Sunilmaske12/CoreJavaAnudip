//Write a Java program that takes a year from the user and prints whether it is a leap year or not.
import java.util.Scanner;
class CubeSquare
{
	public static void main(String arg[])
	{	
		int num, res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		year= sc.nextInt();
		if(num==0)
			{
			System.out.println(num+" is not applicable");	
			}
		else if(num%2==0)
			{	
				res = num*num;
				System.out.println("Square of a "+num+" is "+res);
			}
		else 	
			{
				res = num*num*num;
				System.out.println("Cube of a "+num+" is "+res);
			}						
	}
}	