import java.util.Scanner;

class EvenOdd
{
	public static void main(String arg[])
	{	
		int num1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		num1 = sc.nextInt();
		
		if(num1%2==0)
		{
			System.out.println(num1 +" is even");
		}
		else
		{
			System.out.println(num1 +" is odd ");
		}
		sc.close();
	}
}	