import java.util.Scanner;

class Vote
{
	public static void main(String arg[])
	{	
		int num;
		System.out.println("Enter a age");
		Scanner sc=new Scanner(System.in);
		num = sc.nextInt();
		if(num>=18)
		{
			System.out.println("you are eligible for vote ");
		}
		else
		{
			System.out.println("you are not eligible for vote ");
		}
	}
}	