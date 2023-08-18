import java.util.Scanner;

class IfElseDemo2
{
	public static void main(String arg[])
	{	
		int num1, num2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if(num1>num2)
		{
			System.out.println(num1 +" is greater than "+num2);
		}
		else
		{
			System.out.println(num2 +" is greater than "+num1);
		}
		sc.close();
	}
}	