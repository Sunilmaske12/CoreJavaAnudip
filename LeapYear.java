//Write a Java program that takes a year from the user and prints whether it is a leap year or not.
import java.util.Scanner;
class LeapYear
{
	public static void main(String arg[])
	{	
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		year= sc.nextInt();
		if(year%400==0)
			{
			System.out.println(year+" is a leap year");	
			}
		else if(year%100!=0 && year%4==0)
			{
				System.out.println(year+" is a leap year");
			}
		else 	
			{
				System.out.println(year+" is not a leap year");
			}						
	}
}	