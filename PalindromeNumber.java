// checking Armstrong number fro 3digit number
import java.util.Scanner;

class PalindromeNumber
{
	public static void main(String arg[])
	{
		int orignalNum , num, finalNum =0, digit;
		Scanner sc=new Scanner(System.in);		
		System.out.print("Enter a number : ");
		orignalNum = sc.nextInt();
		num = orignalNum ;
		while(num>0)
		{	
			digit = num%10;
			finalNum = finalNum*10 + digit;
			num = num/10;
		}
		if(orignalNum  == finalNum )
		{
			System.out.print(orignalNum +" is a  palindrom number: ");
		}
		else
		{
			System.out.print(orignalNum +" is not a palindrom  number: ");
		} 		
	}
}