import java.util.Scanner;
class Divisible5_11
{
	public static void main(String arg[])
	{	
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		if(num%5==0  &&  num%11==0)
		{
			System.out.println(num+" is divisible by 5 as well as 11");
		}
		else 
		{
			System.out.println(num+" is not divisible by 5 as well as 11");
		}
							
	}
}	