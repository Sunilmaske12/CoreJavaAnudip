// checking Armstrong number fro 3digit number
import java.util.Scanner;

class ArmstrongNumber
{
	public static void main(String arg[])
	{
		int orignalNum , num, sum=0, rem;
		Scanner sc=new Scanner(System.in);		
		System.out.print("Enter a three digit number: ");
		orignalNum = sc.nextInt();
		num = orignalNum ;
		for(int i=0; i<=2; i++)
		{
			rem = (num%10);
			sum += rem*rem*rem;	
			num = num/10;
		}
		if(orignalNum  == sum)
		{
			System.out.print(orignalNum +" is a  Armstrong number: ");
		}
		else
		{
			System.out.print(orignalNum +" is not a Armstrong  number: ");
		} 		
	}
}