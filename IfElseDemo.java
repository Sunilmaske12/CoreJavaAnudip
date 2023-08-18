import java.util.Scanner;

class IfElseDemo
{
	public static void main(String arg[])
	{	
		int num;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		num = sc.nextInt();
		if(num>0)
		{
			System.out.println("you are enter a positive number "+num);
		}
		else
		{
			System.out.println("you are enter a zero or negative number "+num);
		}
	}
}	